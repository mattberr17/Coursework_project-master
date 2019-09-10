import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;

public class Stlyle {
    public static void listStyleDetails() {
        try {
            PreparedStatement ps = main.db.prepareStatement("SELECT StyleId, Name FROM Style");

            ResultSet results = ps.executeQuery();
            while (results.next()) {
                int styleid = results.getInt(1);
                string name = results.getString(2);
                System.out.println("Style ID:" + styleid + ",");
                System.out.println("Name:" + name + "\n");
            }

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());

        }
    }

    public static void insertStyleDetails(int styleid, string name) {
        try {
            PreparedStatement ps = main.db.prepareStatement(
                    "INSERT INTO Style (StyleId, Name) VALUES(?,?)");
            ps.setInt(1, styleid);
            ps.setString(2, name);

            ps.execute();

        } catch (Exception exception) {
            System.out.println("DATABASE ERROR:" + exception.getMessage());
        }


    }

    public static void deleteStyleDetails(int styleid, string name){
        try{
            PreparedStatement ps = main.db.prepareStatement("DELETE FROM Style WHERE StyleId = ?");
            ps.setInt(1, styleid);
            ps.execute();
        }catch (Exception exception){
            System.out.println("DATABASE ERROR:"+ exception.getMessage());
        }

    }

    public static void updateStyleDetails(int styleid, string name){
        try{
            PreparedStatement ps=main.db.prepareStatement(
                    "UPDATE Style SET Name=? WHERE StyleId=?");
            ps.setString();

            )

        }catch (Exception exception){
            System.out.println("DATABASE ERROR"+exception.getMessage());
        }

    }
}

