package viikko11;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JDBCShoppingListItemDaoTest {

    private JDBCShoppingListItemDao dao = new JDBCShoppingListItemDao();

    /**
     * This method clears the test database and inserts two rows directly in the
     * database before each test with a delete statement.
     * 
     * This way every time the tests are executed they have exactly the same data to
     * work with.
     * 
     * !! Make sure to always use a different database environment variable for each
     * execution environment to prevent data loss or corruption !!
     */
    @BeforeEach
    public void setUp() throws Exception {
        Connection connection = dao.connect();
        connection.prepareStatement("insert into ShoppingListItem (id, title) values (1, 'Milk'), (2, 'Eggs')").executeUpdate();
        connection.prepareStatement("delete from ShoppingListItem where id=2").executeUpdate();
        connection.close();
    }

    // Write the actual tests methods here. You can use Milk (1) and Eggs (2) in all of your tests!
}
