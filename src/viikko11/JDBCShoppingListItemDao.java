package viikko11;

import java.util.List;

public class JDBCShoppingListItemDao implements ShoppingListItemDao {

	private static final String URL = "jdbc:sqlite:.\\shoppinglist.sqlite";
	
    @Override
    public List<ShoppingListItem> getAllItems() {
        return null;
    }

    @Override
    public ShoppingListItem getItem(long id) {
        return null;
    }

    @Override
    public boolean addItem(ShoppingListItem newItem) {
        return false;
    }

    @Override
    public boolean removeItem(ShoppingListItem item) {
        return false;
    }

}