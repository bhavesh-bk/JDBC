import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws   ClassNotFoundException, SQLException {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "Bhavesh@2003";

//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, user, password);

        System.out.println("Connected to database successfully");
        Statement stmt = con.createStatement();
        String sql = "select * from student";
        ResultSet rs = stmt.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("name");
//        System.out.println(name);


        con.close();
        System.out.println("Connection closed");
    }
}
