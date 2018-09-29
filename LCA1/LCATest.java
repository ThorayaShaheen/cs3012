import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {

	  @Test
	    public void insertTest() {
	        Node root = new Node(3);
	        LCA in = new LCA();
	        root = in.insert(root, root.data);
	        	in.insert(root, 4);
	        	in.insert(root, 6);
	        	in.insert(root, 5);
	        	in.insert(root, 7);
	        	in.insert(root, 10);
	        	in.insert(root, 12);
	        	in.insert(root, 9);

	        assertFalse(in.find(root, 13));
	        assertTrue(in.find(root, 12));
	        assertEquals(root.data, 3);
	    }
}
