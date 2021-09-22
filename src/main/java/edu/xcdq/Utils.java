package edu.xcdq;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Utils {
 private static String driverClass;
    private static String user;
    private static String  password;
    private static String url;
    public static void registerInfo() throws IOException {
        InputStream is = Demo01.class.getClassLoader().getResourceAsStream("database.properties");
        Properties properties = new Properties();
        properties.load(is);
         user = properties.getProperty("user");
         password = properties.getProperty("password");
         url = properties.getProperty("url");
         driverClass = properties.getProperty("driverClass");
    }
    public static void closeAll(ResultSet rs, Statement ps, Connection con) {
        // 6 关闭资源
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs = null;
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ps = null;
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            con = null;
        }

    }

    public static String getDriverClass() {
        return driverClass;
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }

    public static String getUrl() {
        return url;
    }
}
