package com.ejemplo.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class conexion_bd {
	

	private static final String JOptionPane = null;
	
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String usuario="root";
	private static String password="Salud2014.";
	private static String url="jdbc:mysql://localhost:3306/users";
	
	 public static void   main(String [] args)
	 {
		 Connection con = null;
		 
		 try {
			 
			 Class.forName("com.mysql.cj.jdbc.Driver");
			  con = DriverManager.getConnection(url, usuario, password);
			  
			  System.out.println("Conexion exitosa.");
			  
			 
	} catch(Exception e) {
		e.printStackTrace();
		
	} 
		
		//Cerrar la conexion
		 
		 try { 
			 if (con != null && !con.isClosed()) {
				 con.close();
				 System.out.println("Conexion cerrada");
			 }
		 } catch (SQLException e) {
			 e.printStackTrace();
		 }
	   }
		 
}
