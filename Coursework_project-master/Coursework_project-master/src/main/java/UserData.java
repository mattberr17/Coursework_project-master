import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;

public class UserData {
    
    public static void listUserDetails() {
        try {
            PreparedStatement ps = main.db.prepareStatement("SELECT UserId, Username, Password FROM UserData");

            ResultSet results = ps.executeQuery();
            while (results.next()) {
                int id = results.getInt(1);
                String name = results.getString(2);
                String password = results.getString(3);
                System.out.println("Id:" + id + ",");
                System.out.println("Name: " + name + ",");
                System.out.println("Password: " + password + "\n");
            }

        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());

        }
    }

    public static void insertUserDetails(int id, String name, String password) {
        try {
            PreparedStatement ps = main.db.prepareStatement(
                    "INSERT INTO UserData (UserId,Username,Password) VALUES(?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, password);

            ps.execute();

        } catch (Exception exception) {
            System.out.println("DATABASE ERROR:" + exception.getMessage());
        }


    }

    public static void deleteUserDetails(int id){
        try{
            PreparedStatement ps = main.db.prepareStatement("DELETE FROM UserData WHERE UserId = ?");
            ps.setInt(1, id);
            ps.execute();
        }catch (Exception exception){
            System.out.println("DATABASE ERROR:"+ exception.getMessage());
        }

    }

    public static void updateUserDetails(int id, String name,String password){
        try{
            PreparedStatement ps=main.db.prepareStatement(
                    "UPDATE UserData SET Username=?,Password=? WHERE UserId=?");
            ps.setString();

            )

        }catch (Exception exception){
            System.out.println("DATABASE ERROR"+exception.getMessage());
        }

    }
}

