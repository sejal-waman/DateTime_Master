import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class Date {

    public static void main(String args[]) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project", "root", "root");

        if (con != null) {
            System.out.println("Connection established.");
        } else {
            System.out.println("Connection is not established.");
        }

        final String Query = "INSERT INTO developer_date VALUES (?, ?)";
        PreparedStatement pstmt = con.prepareStatement(Query);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID number:");
        int id = sc.nextInt();
        pstmt.setInt(1, id);

        System.out.println("Enter date (either dd-mm-yyyy or yyyy-mm-dd):");
        String date = sc.next();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date utildate = null;

        try {
            // Try parsing with first format (dd-mm-yyyy)
            utildate = sdf1.parse(date);
        } catch (Exception e) {
            // If it fails, try the second format (yyyy-mm-dd)
            try {
                utildate = sdf2.parse(date);
            } catch (Exception ex) {
                System.out.println("Invalid date format.");
                return;
            }
        }

        long ms = utildate.getTime();
        System.out.println("Milliseconds: " + ms);

        java.sql.Date sqldate = new java.sql.Date(ms);
        pstmt.setDate(2, sqldate);
        System.out.println("SQL Date: " + sqldate);

        pstmt.executeUpdate();
    }
}
