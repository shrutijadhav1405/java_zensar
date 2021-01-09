package day9.jdbc;

import java.sql.*;

//import javax.print.attribute.standard.PrinterIsAcceptingJobs;

import beans.Product;
import beans.Student;
import utility.DBUtil;

public class Example1 {

	public static void main(String[] args) 
	{
		//Product product1 = new Product(411, "HeadPhone", 5500);
		//Product product1 = new Product(299, "Tab", 30500);
		//Product product2 = new Product(299, "Watch", 10000);
		//ProductDao example1 = new ProductDao();
		//example1.addProduct(product1);
		//example1.getAllProducts();
		//example1.getProduct(11);
		//example1.deleteProduct(1000);
		//example1.updateProduct(product2);
		
		StudentDao stud = new StudentDao();
		//stud.deleteStudent(55);
		//Student s1 = new Student(21, "Jivan", "Java", 1, 16);
		//stud.updateStudent(s1);
		System.out.println(stud.toString());
		System.out.println(stud);
	}
	
	
}
