package viikko10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListDatabase {
	// private static final String URL =
	// "jdbc:sqlite:C:\\Users\\jusju\\Desktop\\syksy2020\\palautettavat\\shoppinglist.sqlite";
	private static final String URL = "jdbc:sqlite:.\\shoppinglist.sqlite";

	public List<ShoppingListItem> listShoppings() {
		List<ShoppingListItem> items = new ArrayList<ShoppingListItem>();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection(URL);
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM ShoppingListItem");
			ResultSet results = statement.executeQuery();
			int laskuri = 1;
			while (results.next()) {
				System.out.println("(" + results.getInt("id") + ") " + results.getString("title"));
				laskuri++;
			}
			results.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return items;
	}

	public void addShopping(String shopping) {
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection(URL);
			PreparedStatement statement = connection.prepareStatement("INSERT INTO ShoppingListItem(title) VALUES (?)",
					Statement.RETURN_GENERATED_KEYS);
			
			statement.setString(1, shopping);
			statement.executeUpdate();
			
			ResultSet keys = statement.getGeneratedKeys();
			if(keys.next()) {
				long id = keys.getLong(1);
			}
			keys.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void deleteShopping(String shopping) {
		
		List<ShoppingListItem> items = new ArrayList<ShoppingListItem>();
		int deletedId = 0;
		try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection(URL);
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM ShoppingListItem WHERE title LIKE(?)");
			statement.setString(1, shopping);
			ResultSet results = statement.executeQuery();

			deletedId = results.getInt("id");

			results.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection(URL);
			PreparedStatement statement = connection.prepareStatement("DELETE FROM ShoppingListItem WHERE id = " + deletedId);
			
			statement.setString(1, shopping);
			statement.executeUpdate();

			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
