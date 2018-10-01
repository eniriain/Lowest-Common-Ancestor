import org.junit.Test;
 //Using JUNIT FrameWork
public class LCATest {
 	
	@Test // test with no nodes
	public void testEmpty() {
		BST<Integer> testBST = new BST<Integer>();
		
		assertNull( LeastCommonAncestor(testBST.root, 7, 1));
	}
 	@Test // test with only one node in
	public void testSingle()
	{
		BST<Integer> testBST = new BST<Integer>();
		testBST.put(7);
		assertNull(LeastCommonAncestor(testBST.root,1,3));
		
	}
	
	@Test // test with multiple nodes
	public void testPopulated()
	{
		BST<Integer> test = new BST<Integer>();
		test.put(9);
		test.put(1);
		test.put(4);
		test.put(19);
		test.put(9);
		test.put(13);
		
	}
}