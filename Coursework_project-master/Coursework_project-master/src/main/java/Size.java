import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;

public class Size {
    public static void listSizeDetails() {
        try {
            PreparedStatement ps = main.db.prepareStatement("SELECT Size FROM Size");

            ResultSet results = ps.executeQuery();
            while (results.next()) {
                String size = results.getString(1);
                System.out.println("Size:" + size + "\n");
            }

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());

        }
    }

    public static void insertSizeDetails(string size) {
        try {
            PreparedStatement ps = main.db.prepareStatement(
                    "INSERT INTO Size (Size) VALUES(?)");
            ps.setString(1, size);

            ps.execute();

        } catch (Exception exception) {
            System.out.println("DATABASE ERROR:" + exception.getMessage());
        }


    }

    public static void deleteSizeDetails(string size){
        try{
            PreparedStatement ps = main.db.prepareStatement("DELETE FROM Size WHERE Size = ?");
            ps.setString(1, size);
            ps.execute();
        }catch (Exception exception){
            System.out.println("DATABASE ERROR:"+ exception.getMessage());
        }

    }

    public static void updateSizeDetails(string size){
        try{
            PreparedStatement ps=main.db.prepareStatement(
                    "UPDATE Size SET Size=? WHERE Size=?");
            ps.setString();

            )

        }catch (Exception exception){
            System.out.println("DATABASE ERROR"+exception.getMessage());
        }

    }
}

