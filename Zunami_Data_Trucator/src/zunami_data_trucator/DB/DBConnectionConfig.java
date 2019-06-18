/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zunami_data_trucator.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author lashan_h
 */
public class DBConnectionConfig {
    private static Connection con;
    private static void setupConncetion()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://"+DBConfig.getHost()+":"+DBConfig.getPort()+"/"+DBConfig.getDbname(), DBConfig.getUsername(), DBConfig.getPassword());
        con.setAutoCommit(false);
    }
    public static void iud(String sql)throws Exception{
        if (con==null) {
            setupConncetion();
        }
        con.createStatement().executeUpdate(sql);
    }
    
    public static ResultSet search(String sql)throws Exception{
        if (con==null) {
            setupConncetion();
        }
        return con.createStatement().executeQuery(sql);
    }
    public static Connection getConnectionInstance()throws Exception{
        if (con==null) {
            setupConncetion();
        }
        return con;
    }
}
