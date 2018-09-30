import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {

	    @Test
	    public void insertTest() {
				  Node root = new Node(3);
	        root = LCA.insert(root, root.data);

	        	LCA.insert(root, 4);
	        	LCA.insert(root, 6);
	        	LCA.insert(root, 5);
	        	LCA.insert(root, 7);
	        	LCA.insert(root, 10);
	        	LCA.insert(root, 12);
	        	LCA.insert(root, 9);


	        assertTrue(LCA.find(root, 3));
	        assertTrue(LCA.find(root, 12));
	        assertTrue(LCA.find(root, 10));
	        assertFalse(LCA.find(root, 20));
	        assertFalse(LCA.find(root, 100));
	        assertTrue(LCA.find(root, 6));
	        assertTrue(LCA.find(root, 9));
	        assertTrue(LCA.find(root, 7));
	    }
			@Test
	    public void lcaTest() {
			 	 Node root = new Node(6);
				 LCA.insert(root, root.data);
				 LCA.insert(root, 7);
				 LCA.insert(root, 9);
				 LCA.insert(root, 14);
				 LCA.insert(root, 8);
				 LCA.insert(root, 1);
				 LCA.insert(root, 25);
				 LCA.insert(root, 70);

				 Node ancestor = LCA.lca(root, 9, 25);
				 assertEquals(ancestor.data,9);

				 ancestor = LCA.lca(root, 7, 70);
				 assertEquals(ancestor.data,7);

				 ancestor = LCA.lca(root, 14, 25);
				 assertEquals(ancestor.data,14);

				 ancestor = LCA.lca(root, 1, 7);
				 assertEquals(ancestor.data,6);
	 }
}
