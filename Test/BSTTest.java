import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


public class BSTTest {
	
     BST bst = null;
     
     @Before
     public void initilize(){
    	 bst  =  new BST();
     }
	@Test
	public void initTest(){
		BST b = new BST();
		assertNotNull(b);
	}
	@Test
	public void isEmpty(){
		assertTrue(bst.isEmpty());
		bst.insert(32);
		assertFalse(bst.isEmpty());
	}
	@Test
	public void insertTest(){
		bst.insert(3);
		bst.insert(32);
		assertTrue(bst.search(32)==32);

		assertTrue(bst.search(3)==3);
		
	}
	@Test
	public void deleateTest(){
		bst.insert(54);
		TestCase.assertTrue(bst.deleteNode(54)==54);
		 
		TestCase.assertTrue(bst.deleteNode(54)==-1);
		
	}

}
