import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;

public class UserClothes {
    public static void listUserClothesDetails() {
        try {
            PreparedStatement ps = main.db.prepareStatement("SELECT UserId, ClothingId FROM UserClothes);

            ResultSet results = ps.executeQuery();
            while (results.next()) {
                int id = results.getInt(1);
                String clothingid = results.getString(2);
                System.out.println("Id:" + id + ",");
                System.out.println("Clothing ID: " + name + "\n");
            }

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());

        }
    }

    public static void insertUserClothesDetails(int id, int clothingid) {
        try {
            PreparedStatement ps = main.db.prepareStatement(
                    "INSERT INTO UserClothes (UserId,ClothingId) VALUES(?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, clothingid);


            ps.execute();

        } catch (Exception exception) {
            System.out.println("DATABASE ERROR:" + exception.getMessage());
        }


    }

    public static void deleteUserClothesDetails(int id){
        try{
            PreparedStatement ps = main.db.prepareStatement("DELETE FROM UserClothes WHERE UserId = ?");
            ps.setInt(1, id);
            ps.execute();
        }catch (Exception exception){
            System.out.println("DATABASE ERROR:"+ exception.getMessage());
        }

    }
}

