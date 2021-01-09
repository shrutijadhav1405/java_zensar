package Day8.jdbc;

import java.sql.*;

import beans.Product;
import utility.DBUtil;

public class Example7 {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Laptop", 2000);
		Example7 example7 = new Example7();
		example7.addProduct(product1);
		
	}
	
	public void addProduct(Product product)
	{
		System.out.println("Now going to insert the product: "+product);
		
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "insert into product values(?, ?, ?)";
		try
		{
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, product.getProductId());
		pst.setString(2, product.getProductName());
		pst.setInt(3, product.getPrice());
		int result = pst.executeUpdate();
		if(result == 0)
		{
			System.out.println("Insertion Failed");
		}
		else
		{
			System.out.println("Insertion successfull");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
