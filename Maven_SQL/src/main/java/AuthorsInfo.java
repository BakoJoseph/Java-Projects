import java.sql.*;

public class AuthorsInfo {

    public void statement() throws ClassNotFoundException, SQLException {
        String str = "SELECT * FROM StoreAuthor";
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/author?autoReconnect=true&useSSL=false", "root", "202255");
             Statement stmt  = con.createStatement();
        ) {
            ResultSet rs = stmt.executeQuery(str);
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                System.out.print(id + "\t");

                if (name.length() <= 7) {
                    System.out.print(name + "\t\t");
                } else {
                    System.out.print("\t" + name + "\t");
                }
                System.out.println(city);

            }
        }
    }
    public void select() throws ClassNotFoundException, SQLException {
        String str2 = "select * from StoreAuthor where id = 2;";
        String str3 = "select * from StoreAuthor where id = 3;";
        String str5 = "select * from StoreAuthor where id = 5;";
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/author?autoReconnect=true&useSSL=false", "root", "@Qazwsxedc2023");
             Statement stmt  = con.createStatement();
        ) {
//            ResultSet rs = stmt.executeQuery(str2);
//            iterating(rs);
            ResultSet rs3 = stmt.executeQuery(str3);
            iterating(rs3);
            ResultSet rs5 = stmt.executeQuery(str5);
            iterating(rs5);
        }
    }
    public void preparedSelect() throws ClassNotFoundException, SQLException {
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/author?autoReconnect=true&useSSL=false", "root", "@Qazwsxedc2023");
             PreparedStatement stmt = con.prepareStatement("select * from StoreAuthor where id = ?;")
        ) {
            stmt.setString(1, "2");
//            ResultSet rs = stmt.executeQuery();
//            iterating(rs);
            stmt.setString(1, "3");
            ResultSet rs3 = stmt.executeQuery();
            iterating(rs3);
            stmt.setString(1, "5");
            ResultSet rs5 = stmt.executeQuery();
            iterating(rs5);
        }
    }
    public void iterating(ResultSet rs) throws SQLException {
        while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            String city = rs.getString("city");
            System.out.print(id + "\t");

            if (name.length() <= 7) {
                System.out.print(name + "\t\t");
            } else {
                System.out.print("\t" + name + "\t");
            }
            System.out.println(city);

        }

    }
    public void preparedStatement() throws ClassNotFoundException, SQLException {
        String str = "SELECT * FROM StoreAuthor WHERE city LIKE 'S%'";
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/author?autoReconnect=true&useSSL=false", "root", "@Qazwsxedc2023");
             PreparedStatement stmt = con.prepareStatement("SELECT id, city, name FROM StoreAuthor WHERE id= ?")
        ) {
            stmt.setString(1, "3");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                System.out.print(id + "\t");

                if (name.length() <= 7) {
                    System.out.print(name + "\t\t");
                } else {
                    System.out.print("\t" + name + "\t");
                }
                System.out.println(city);

            }


        }
    }
    public void callableStatement() throws ClassNotFoundException, SQLException {
        String str = "SELECT * FROM StoreAuthor WHERE city LIKE 'S%'";
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/author?autoReconnect=true&useSSL=false", "root", "@Qazwsxedc2023");
             CallableStatement stmt = con.prepareCall("call listAuthor")
        ) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                System.out.print(id + "\t");

                if (name.length() <= 7) {
                    System.out.print(name + "\t\t");
                } else {
                    System.out.print("\t" + name + "\t");
                }
                System.out.println(city);

            }


        }
    }
    public void updateResultSet()throws ClassNotFoundException, SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/author?autoReconnect=true&useSSL=false", "root", "@Qazwsxedc2023");
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ) {
            ResultSet rs = stmt.executeQuery("SELECT id, name, city  FROM StoreAuthor WHERE id=3");
            rs.next();
            rs.updateString("name", "NY");
            rs.updateString("city", "New york city");
            rs.updateRow();
        }


    }



    public void inserting() throws ClassNotFoundException, SQLException {
        String str = "insert into StoreAuthor values (9, 'sam', 'new');";
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/author?autoReconnect=true&useSSL=false", "root", "@Qazwsxedc2023");
             Statement stmt  = con.createStatement();
        ) {
            int rs = stmt.executeUpdate(str);

            System.out.println(rs);
        }
    }

    public void deleting(int id) throws ClassNotFoundException, SQLException {
        String str = "delete from storeAuthor where id = " + String.valueOf(id) +";";
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/author?autoReconnect=true&useSSL=false", "root", "@Qazwsxedc2023");
             Statement stmt  = con.createStatement();
        ) {
            int rs = stmt.executeUpdate(str);
            System.out.println(rs);
        }
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        AuthorsInfo authorsInfo = new AuthorsInfo();
        // authorsInfo.statement();
        //authorsInfo.inserting();
        //authorsInfo.deleting(8);
        //System.out.println("for statement");
        //authorsInfo.select();
        //System.out.println("for prepared statement");
//        authorsInfo.preparedSelect();
        authorsInfo.statement();
    }
}



