import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BSTsTest {
    private BinarySearchTree bst;

    @Before
    public void setUp() {
        bst = new BinarySearchTree();
    }

    @Test
    public void testInsertAndSearch() {
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        assertNotNull(bst.search(50));
        assertNotNull(bst.search(30));
        assertNotNull(bst.search(70));
        assertNull(bst.search(100));
    }

    @Test
    public void testDelete() {
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        bst.delete(20);
        assertNull(bst.search(20));
        
        bst.delete(30);
        assertNull(bst.search(30));
        
        bst.delete(50);
        assertNull(bst.search(50));
        assertNotNull(bst.search(70));
    }

    @Test
    public void testHeight() {
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        
        assertEquals(2, bst.height());
        
        bst.insert(10);
        assertEquals(3, bst.height());
    }

    @Test
    public void testCountNodes() {
        assertEquals(0, bst.countNodes());

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        
        assertEquals(3, bst.countNodes());

        bst.delete(30);
        assertEquals(2, bst.countNodes());
    }

    @Test
    public void testIsBalanced() {
        assertTrue(bst.isBalanced());
        
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        
        assertFalse(bst.isBalanced());
        
        bst.insert(10);
        assertFalse(bst.isBalanced());
        
        bst.delete(20);
        assertTrue(bst.isBalanced());
    }

    @Test
    public void testClear() {
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.clear();
        
        assertEquals(0, bst.countNodes());
        assertNull(bst.search(50));
    }
}
