import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestJDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 获取用户信息和url
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter  Proxy address: ");
        String dbproxy = sc.nextLine();
        System.out.println("Please enter database port: ");
        String dbport = sc.nextLine();
        System.out.println("Please enter database name: ");
        String dbname = sc.nextLine();
        System.out.println("Please enter database user: ");
        String username = sc.nextLine();
        System.out.println("Please enter database password: ");
        String password = sc.nextLine();
        String url = "jdbc:mysql://" + dbproxy + ":" + dbport + "/" + dbname + "?useUnicode=true&characterEncoding=utf8&useSSL=true";

        // 连接成功，数据库对象 Connection
        Connection connection = DriverManager.getConnection(url,username,password);

        // 执行SQL对象Statement，执行SQL的对象
        Statement statement = connection.createStatement();

        // 执行SQL的对象去执行SQL，返回结果集
        String sql = "SELECT variable_name,variable_value FROM performance_schema.global_variables WHERE variable_name LIKE '%version%';";
        ResultSet resultSet = statement.executeQuery(sql);

        // 输出连接测试信息
        System.out.println("---------------JDBC Connection Test---------------");

        // 输出当前时间
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println("接口当前测试时间是: " + formatter.format(date));

        // 输出performance_schema.global_variables表中信息
        System.out.println("当前连接测试的数据库信息如下: ");
        System.out.printf("%40s%n","VARIABLE_NAME\t\tVARIABLE_VALUE");
        while(resultSet.next()){
            System.out.printf("%26s",resultSet.getString("variable_name") + "\t\t");
            System.out.printf("%s",resultSet.getString("variable_value") + "\n");
        }

        // 释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
