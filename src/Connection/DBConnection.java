/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Gustavo
 */
public class DBConnection {
    static Connection con = null;
    public static String ip = "jdbc:mysql://localhost:3306/DBGRS?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=CTT";
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(ip, "root", "Numsey#2023");
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
