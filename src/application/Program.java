package application;

import java.sql.Connection;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
	}

}