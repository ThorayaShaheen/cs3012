import static org.junit.Assert.*;

import org.junit.Test;

public class LCATest {

	  @Test
	    public void lcaTest() {

		  LCA.makeMatrix(4);

		  LCA.makeConnection(1, 2);
		  LCA.makeConnection(2, 3);
		  LCA.makeConnection(3, 4);

	      assertEquals(LCA.lca(1-1, 2-1, 3-1), 2);
	      assertEquals(LCA.lca(1-1, 3-1, 4-1), 3);
	      assertEquals(LCA.lca(1-1, 1-1, 2-1), 1);
	      assertEquals(LCA.lca(1-1, 1-1, 4-1), 1);
	      assertEquals(LCA.lca(1-1, 1-1, 1-1), 1);
	      assertEquals(LCA.lca(1-1, 4-1, 4-1), 4);

	    }

}
