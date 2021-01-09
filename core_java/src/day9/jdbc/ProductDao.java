package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Product;
import utility.DBUtil;

public class ProductDao {

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
	
	public void getAllProducts() 
	{
		String sql = "select * from product";
		Connection con = DBUtil.getMySqlDbConnection();
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				int pid = rs.getInt("product_id");
				String pname = rs.getString("product_name");
				int pprice = rs.getInt("price");
				System.out.println("Product id: " +pid);
				System.out.println("Product name: " +pname);
				System.out.println("Price: " +pprice);
				System.out.println("******************************");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}
	}
	
	public void getProduct(int productId)
	{
		String sql = "select * from product where product_id = ?";
		Connection con = DBUtil.getMySqlDbConnection();
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, productId);
			ResultSet rs = pst.executeQuery();
			
			
			if(rs.next())
			{
				int pid = rs.getInt("product_id");
				String pname = rs.getString("product_name");
				int pprice = rs.getInt("price");
				System.out.println("Product id: " +pid);
				System.out.println("Product name: " +pname);
				System.out.println("Price: " +pprice);
				System.out.println("******************************");
			}
			else
			{
				System.out.println("Product does not exist");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}
		
	}
	
	public void deleteProduct(int productId)
	{
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "delete from product where product_id = ?";
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, productId);
			
			int del = pst.executeUpdate();
			
			if(del == 0)
			{
				System.out.println("Product does not exist");
				System.out.println("No product deleted");
			}
			else
			{
				System.out.println("Product deleted");
				System.out.println(del + "Rows deleted");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}
	}
	
	public void updateProduct(Product product)
	{
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "update product set product_name=?, price=? where product_id=?";
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, product.getProductName());
			pst.setInt(2, product.getPrice());
			pst.setInt(3, product.getProductId());
			
			int result = pst.executeUpdate();
			
			if(result == 0)
			{
				System.out.println("Product does not exist");
			}
			else
			{
				System.out.println("Product updated successfully");
				//System.out.println("Updated product details");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: " +e);
		}
	}
}
