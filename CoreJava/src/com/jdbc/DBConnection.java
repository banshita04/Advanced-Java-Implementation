package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
public static void main(String[] args) {
	dbConnect();
}

public static Connection dbConnect() {
	Connection con=null;
	try {
//	/	Class.forName("com.mysql.jdbc.Driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded succesfully");
		//URL : http://www.google.com:80
		      //protocol://domainname or ipaddress : portNo
		//String url="jdbc:mysql://localhost:3306/cg_jan_24";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String uname="system";
		String pwd="root";
		con=DriverManager.getConnection(url,uname,pwd);
		System.out.println("Connected with DB");
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}

}