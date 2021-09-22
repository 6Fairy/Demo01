package edu.xcdq;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws Exception {
          Utils.registerInfo();
        // 1获取驱动
        Class.forName(Utils.getDriverClass());
        //2.获取连接
        Connection connection = DriverManager.getConnection(Utils.getUrl(),Utils.getUser(),Utils.getPassword());
        // 3 获取状态
        PreparedStatement ps = connection.prepareStatement("select*from book");
        // 4执行
        ResultSet resultSet = ps.executeQuery();
        // 5遍历结果
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + resultSet.getString(2)
                    + resultSet.getString(3) + resultSet.getString(4));
        }
        //6关闭资源
        Utils.closeAll(resultSet ,ps ,connection);

    }




}