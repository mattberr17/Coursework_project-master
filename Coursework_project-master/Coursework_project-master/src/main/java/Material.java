import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;

public class Material {
    public static void listMaterialDetails() {
        try {
            PreparedStatement ps = main.db.prepareStatement("SELECT Material FROM Material");

            ResultSet results = ps.executeQuery();
            while (results.next()) {
                String material = results.getString(1);
                System.out.println("Material:" + material + "\n");
            }

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());

        }
    }

    public static void insertMaterialDetails(string material) {
        try {
            PreparedStatement ps = main.db.prepareStatement(
                    "INSERT INTO Material (Material) VALUES(?)");
            ps.setString(1, material);

            ps.execute();

        } catch (Exception exception) {
            System.out.println("DATABASE ERROR:" + exception.getMessage());
        }


    }

    public static void deleteMaterialDetails(string material){
        try{
            PreparedStatement ps = main.db.prepareStatement("DELETE FROM Material WHERE Material = ?");
            ps.setString(1, material);
            ps.execute();
        }catch (Exception exception){
            System.out.println("DATABASE ERROR:"+ exception.getMessage());
        }

    }

    public static void updateUserDetails(string material){
        try{
            PreparedStatement ps=main.db.prepareStatement(
                    "UPDATE Material SET Material=? WHERE Material=?");
            ps.setString();

            )

        }catch (Exception exception){
            System.out.println("DATABASE ERROR"+exception.getMessage());
        }

    }
}

