package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class SQLIO {
	private PreparedStatement statement;
	private Connection connection;
	ResultSet result;
	private Properties properties;

	public SQLIO(Properties properties) {
		try {
			Class.forName("org.postgresql.Driver");
			this.setProperties(properties);

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void closeConnection() {
		try {
			statement.close();
			connection.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Product getProduct(String id){
		Product product = null;
		try {
			String url = properties.getProperty("url");
			
			connection = DriverManager.getConnection(url, properties);

			String sql = "Select * from r0582534.product where productid = ?";

			// try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, id);
			result = statement.executeQuery();

			while (result.next()) {
				String productid = result.getString("productid");
				String title = result.getString("title");
				String category = result.getString("category");
				double price = result.getDouble("price");
				product = new Product(productid,title,category,price);
				return product;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return product;
	}
}
