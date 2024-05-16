
package service;

import java.sql.*;
import java.util.ArrayList;
import utility.DBConnect;


public class HoaDonService {
    private static Connection con = null;
    //chuan bi thuc hien lenh
    private PreparedStatement pr = null;
    // tap ket qua truy van
    private ResultSet rs = null;
    //cau lenh sql
    private String sql = null;
    
    public HoaDonService(){
        con= DBConnect.getConnection();
    }
    
    
}
