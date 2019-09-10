import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;

public class ClothingData {
    public static void listClothingDetails() {
        try {
            PreparedStatement ps = main.db.prepareStatement("SELECT ClothingId, StyleId, Name, Size, Material, Colour FROM UserData");

            ResultSet results = ps.executeQuery();
            while (results.next()) {
                int id = results.getInt(1);
                int styleid = results.getInt(2);
                String name = results.getString(3);
                String size = results.getString(4);
                String material = results.getString(5);
                String colour = results.getString(6);
                System.out.println("Clothing Id:" + id + ",");
                System.out.println("Style Id: " + styleid + ",");
                System.out.println("Password: " + name + ",");
                System.out.println("Password: " + size + ",");
                System.out.println("Password: " + material + ",");
                System.out.println("Password: " + colour + "\n");
            }

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());

        }
    }

    public static void insertClothingDetails(int clothingid, int styleid, string name,string size, string material, string colour) {
        try {
            PreparedStatement ps = main.db.prepareStatement(
                    "INSERT INTO ClothingData (ClothingId, StyleId, Name, Size, Material, Colour) VALUES(?,?,?,?,?,?)");
            ps.setInt(1, clothingid);
            ps.setInt(2, styleid);
            ps.setString(3, name);
            ps.setString(4, size);
            ps.setString(5, material);
            ps.setString(6, colour);

            ps.execute();

        } catch (Exception exception) {
            System.out.println("DATABASE ERROR:" + exception.getMessage());
        }


    }

    public static void deleteClothingDetails(int clothingid){
        try{
            PreparedStatement ps = main.db.prepareStatement("DELETE FROM ClothingData WHERE ClothingId = ?");
            ps.setInt(1, clothingid);
            ps.execute();
        }catch (Exception exception){
            System.out.println("DATABASE ERROR:"+ exception.getMessage());
        }

    }

    public static void updateUserDetails(int clothingid, int styleid, string name,string size, string material, string colour){
        try{
            PreparedStatement ps=main.db.prepareStatement(
                    "UPDATE ClothingData SET StyleId=?,Name=?,Size=?,Material=?,Colour=? WHERE ClothingId=?");
            ps.setString();

            )

        }catch (Exception exception){
            System.out.println("DATABASE ERROR"+exception.getMessage());
        }

    }
}

