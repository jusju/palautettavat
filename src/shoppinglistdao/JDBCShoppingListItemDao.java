package shoppinglistdao;

import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * TODO: Complete the implementation of this DAO-class 
 * by implementing database operations for each of the 
 * CRUD methods.
 */
public class JDBCShoppingListItemDao implements ShoppingListItemDao {

    // read the database connection String from an environment variable:
    private static final String JDBC_URL = "jdbc:sqlite:.\\shoppinglist.sqlite";

    private Connection connect() { 
    	Connection connection = null;
    	try {
    		Class.forName("org.sqlite.JDBC");
    		connection = DriverManager.getConnection(JDBC_URL);
    	} catch(Exception ex) {
    		System.out.println("Yhteyden luonti tietokantaan epäonnistui.");
    	}
        return connection;
    }
	
    @Override
    public List<ShoppingListItem> getAllItems() {
    	// KOODAA TÄHÄN KOODI, JOKA TEKEE TÄMÄN ASIAN
        return null;
    }

    @Override
    public ShoppingListItem getItem(long id) {
    	// KOODAA TÄHÄN KOODI, JOKA TEKEE TÄMÄN ASIAN
        return null;
    }

    @Override
    public boolean addItem(ShoppingListItem newItem) {
    	// KOODAA TÄHÄN KOODI, JOKA TEKEE TÄMÄN ASIAN
        return false;
    }

    @Override
    public boolean removeItem(ShoppingListItem item) {
    	// KOODAA TÄHÄN KOODI, JOKA TEKEE TÄMÄN ASIAN
        return false;
    }

}