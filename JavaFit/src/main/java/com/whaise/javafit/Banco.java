package com.whaise.javafit;

import java.sql.*;

public class Banco {
    Connection con = null;
    
    public static Connection ConectarDB(){
        try{
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
    
}
