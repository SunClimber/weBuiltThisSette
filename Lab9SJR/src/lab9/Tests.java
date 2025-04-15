package lab9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests {
    private ChainHashMapSet<String> set;

    //reset set before each test
    @BeforeEach
    public void setUp() {
        set = new ChainHashMapSet<>();
    }

    //testing isEmpty is true, and size of initial map should be 0
    @Test
    public void testIsEmptyInitially() {
        assertTrue(set.isEmpty());
        assertEquals(0, set.size());
    }

    //testing add(), contains(), and size()
    @Test
    public void testAddAndContains() {
        assertTrue(set.add("apple"));
        assertTrue(set.contains("apple"));
        assertEquals(1, set.size());
    }

    //adding something that's in there already should return false stay same size
    @Test
    public void testAddDuplicate() {
        assertTrue(set.add("banana"));
        assertFalse(set.add("banana")); // duplicate
        assertEquals(1, set.size());
    }

    //remove element test, covering all bases here with contains() and size()
    @Test
    public void testRemove() {
        set.add("cherry");
        assertTrue(set.remove("cherry"));
        assertFalse(set.contains("cherry"));
        assertEquals(0, set.size());
    }

    //test removing something that isn't in set
    @Test
    public void testRemoveNonexistent() {
        assertFalse(set.remove("dragonfruit"));
    }

    //test clearing out set to 0 elements
    @Test
    public void testClear() {
        set.add("eggplant");
        set.add("fig");
        set.clear();
        assertTrue(set.isEmpty());
        assertEquals(0, set.size());
    }

    //test iterating thru keySet to make sure all elements are there
    @Test
    public void testKeySet() {
        set.add("grape");
        set.add("honeydew");
        set.add("kiwi");

        int count = 0;
        for (String string : set.keySet()) {
            assertTrue(set.contains(string));
            count++;
        }
        assertEquals(3, count);
    }
}

