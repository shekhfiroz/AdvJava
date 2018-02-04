package com.main.InsertData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		System.out.println("Connected database successfully...");
		System.out.println("Enter Enter TableName");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		Statement stm = conn.createStatement();
		ResultSet rs = stm.executeQuery("insert into table" + " ");

	}

}
