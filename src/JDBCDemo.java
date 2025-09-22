import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws   ClassNotFoundException, SQLException {

        int rollno = 7;
        String name = "John";
        int marks = 67;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "Bhavesh@2003";
        String sql = "insert into student values (?, ?, ?)";

//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, user, password);

        System.out.println("Connected to database successfully");
        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setInt(1, rollno);
        stmt.setString(2, name);
        stmt.setInt(3, marks);
        stmt.execute();
//        ResultSet rs = stmt.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("name");
//        System.out.println(name);

//        while (rs.next()) {
//            System.out.print(rs.getInt(1) + "). ");
//            System.out.print(rs.getString(2) + " : ");
//            System.out.println(rs.getInt(3));
//
//        }


        con.close();
        System.out.println("Connection closed");
    }
}
