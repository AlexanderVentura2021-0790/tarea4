package sistema;

import java.sql.*;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;

public class conexion {
	
	private static Connection cn;
	
	public static Connection getConnection() {
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-HQPP9IM\\SQLEXPRESS:1433;databaseName=sistema2","UserJava","123");
			
			
		}  catch (Exception e){
			
			cn = null;
				
			
		}
		return cn;
		
		
	}
	public static void main (String[]args) {
		
		Connection pruebaCn = conexion.getConnection();
		if(pruebaCn!= null) {
			System.out.println("conectado");
			System.out.println(pruebaCn);
			
			
		}else {
			
			System.out.println("desconectado");
			
			
		}
		
	}
	
}
