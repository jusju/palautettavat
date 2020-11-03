package viikko10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListDatabase {
	private static final String URL = "jdbc:sqlite:C:\\Users\\jusju\\Desktop\\syksy2020\\palautettavat\\shoppinglist.sqlite";

	
	public List<ShoppingListItem> listShoppings() {
		List<ShoppingListItem> items = new ArrayList<ShoppingListItem>();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection(URL);
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM ShoppingListItem");
			ResultSet results = statement.executeQuery();
			int  laskuri = 1;
			while(results.next()) {
				System.out.println("(" + laskuri + ")" + results.getString("title"));
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
	
}
