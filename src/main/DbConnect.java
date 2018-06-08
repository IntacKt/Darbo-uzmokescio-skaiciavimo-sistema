package main;
import  java.sql.*;
import javax.swing.*;
public class DbConnect {
	
	Connection conn;
	
	public static Connection doConnect(){
		
		String host = "jdbc:mysql://localhost:3306/scs"; 
        String uName = "root";
        String uPass = "";
        
        try {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host, uName, uPass);
			System.out.println("Connected");
			return conn;
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e);
			return null;
		} 
	}

}
