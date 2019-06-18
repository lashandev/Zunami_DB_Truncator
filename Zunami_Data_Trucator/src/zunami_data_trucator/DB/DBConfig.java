/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zunami_data_trucator.DB;

/**
 *
 * @author lashan_h
 */
public class DBConfig{
    private static String host;
    private static String port;
    private static String dbname;
    private static String username;
    private static String password;

    public static String getHost() {
        return host;
    }

    public static void setHost(String aHost) {
        host = aHost;
    }

    public static String getPort() {
        return port;
    }

    public static void setPort(String aPort) {
        port = aPort;
    }

    public static String getDbname() {
        return dbname;
    }

    public static void setDbname(String aDbname) {
        dbname = aDbname;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String aUsername) {
        username = aUsername;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String aPassword) {
        password = aPassword;
    }
    
    
}
