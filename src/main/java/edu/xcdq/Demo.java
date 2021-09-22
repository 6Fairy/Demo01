package edu.xcdq;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Demo {

        /*public static void main(String[] args)throws Exception,ClassNotFoundException {
            InputStream is = Demo.class.getClassLoader().getResourceAsStream("database.properties");
            Properties pros = new Properties();
            pros.load(is);
            String user = pros.getProperty("user");
            String password = pros.getProperty("password");
            String url = pros.getProperty("url");
            String driverClass = pros.getProperty("driverClass");
            // 1获取驱动
            Class.forName(driverClass);
            //2.获取连接
            Connection conn = DriverManager.getConnection(url,user,password);
            // 3 获取状态
            PreparedStatement ps =conn.prepareStatement("select*from book");
             // 4 执行
            ResultSet resultSet =ps.executeQuery();
            // 5遍历结果
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+resultSet.getString(2)
                +resultSet.getString(3)+resultSet.getString(4));
            }
            // 6 关闭资源
            resultSet.close();
            ps.close();
            conn.close();
        }*/
       @Test
        public void testConnection() throws Exception {
            InputStream is = Demo.class.getClassLoader().getResourceAsStream("database.properties");
            Properties pros = new Properties();
            pros.load(is);
            String user = pros.getProperty("user");
            String password = pros.getProperty("password");
            String url = pros.getProperty("url");
            String driverClass = pros.getProperty("driverClass");
            // 1获取驱动
            Class.forName(driverClass);
            //2.获取连接
            Connection conn = DriverManager.getConnection(url,user,password);
        }
}
