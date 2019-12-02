import java.sql.*;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student?useSSL=false",
                "root",
                "990302qw"
        );
        /*x新建一个班：向日葵班
         加入三个新生
         sn：10086  蜡笔小新
         sn：10039  麦兜
         sn：10028  孙悟空
         */

         Statement statement=connection.createStatement() ;
        int rows=statement.executeUpdate("INSERT INTO classes(name) VALUES('xiangrikui')");

        int rows1=statement.executeUpdate("INSERT INTO students(sn,name) VALUES('10086''labixiaoxin')where classes.name='xiangrikui' and classes.id=students.class_id") ;
        int rows2=statement.executeUpdate("INSERT INTO students(sn,name) VALUES('10039''maidou')where classes.name='xiangrikui' and classes.id=students.class_id");
        int rows3=statement.executeUpdate("INSERT INTO students(sn,name) VALUES('10028''sunwukong')where classes.name='xiangrikui' and classes.id=students.class_id");
        System.out.println(rows3);
//       int rows=statement.executeUpdate("UPDATE classes SET name=('C++班') WHERE name='java十一班'");
//        System.out.println(rows);

//       int rows=statement.executeUpdate("INSERT INTO classes(name) VALUES('java十一班')");
//        System.out.println(rows);
//        statement.execute("SHOW TABLES");
//        ResultSet resultSet=statement.executeQuery("SHOW TABLES");
//        while(resultSet.next()){
//            String tableName=resultSet.getString(1);
//            System.out.println(tableName);
//        }
//        resultSet.close();
        statement.close();
       // System.out.println(connection);
        connection.close();
    }
}
