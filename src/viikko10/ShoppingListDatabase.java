package viikko10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListDatabase {
	private static final String URL = "jdbc:sqlite:C:\\Users\\jusju\\Desktop\\syksy2020\\palautettavat\\shoppinglist.sqlite";

	public Connection connect() {
		try {
			Class.forName("org.sqlite.JDBC");
			return DriverManager.getConnection(URL);
		} catch(SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<ShoppingListItem> listShoppings() {
		List<ShoppingListItem> items = new ArrayList<ShoppingListItem>();
		
		
		
		
		return items;
	}
	
}
