package kata2.kata2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursivelySearchTest {

	@Test
	public void recursively_search_test_in_BinaryChop() {	
		BinaryChop binaryChop = new BinaryChop();


		assertEquals("Check that three is in the empty arrey and on which place.", -1, binaryChop.recursivelySearchElement(3, new int[]{}));
		assertEquals("Check that three is in the one element arrey and on which place.", -1, binaryChop.recursivelySearchElement(3, new int[]{1}));
		assertEquals("Check that one is in the one element arrey and on which place.", 0, binaryChop.recursivelySearchElement(1, new int[]{1}));

		assertEquals("Check that one is in the three element arrey and on which place.", 0, binaryChop.recursivelySearchElement(1, new int[]{1, 3, 5}));
		assertEquals("Check that three is in the three element arrey and on which place.", 1, binaryChop.recursivelySearchElement(3, new int[]{1, 3, 5}));
		assertEquals("Check that five is in the three element arrey and on which place.", 2, binaryChop.recursivelySearchElement(5, new int[]{1, 3, 5}));
		assertEquals("Check that zero is in the three element arrey and on which place.", -1, binaryChop.recursivelySearchElement(0, new int[]{1, 3, 5}));
		assertEquals("Check that two is in the three element arrey and on which place.", -1, binaryChop.recursivelySearchElement(2, new int[]{1, 3, 5}));
		assertEquals("Check that four is in the three element arrey and on which place.", -1, binaryChop.recursivelySearchElement(4, new int[]{1, 3, 5}));
		assertEquals("Check that six is in the three element arrey and on which place.", -1, binaryChop.recursivelySearchElement(6, new int[]{1, 3, 5}));
		
		assertEquals("Check that one is in the four element arrey and on which place.", 0, binaryChop.recursivelySearchElement(1, new int[]{1, 3, 5, 7}));
		assertEquals("Check that three is in the four element arrey and on which place.", 1, binaryChop.recursivelySearchElement(3, new int[]{1, 3, 5, 7}));
		assertEquals("Check that five is in the four element arrey and on which place.", 2, binaryChop.recursivelySearchElement(5, new int[]{1, 3, 5, 7}));
		assertEquals("Check that seven is in the four element arrey and on which place.", 3, binaryChop.recursivelySearchElement(7, new int[]{1, 3, 5, 7}));
		assertEquals("Check that zero is in the four element arrey and on which place.", -1, binaryChop.recursivelySearchElement(0, new int[]{1, 3, 5, 7}));
		assertEquals("Check that two is in the four element arrey and on which place.", -1, binaryChop.recursivelySearchElement(2, new int[]{1, 3, 5, 7}));
		assertEquals("Check that four is in the four element arrey and on which place.", -1, binaryChop.recursivelySearchElement(4, new int[]{1, 3, 5, 7}));
		assertEquals("Check that six is in the four element arrey and on which place.", -1, binaryChop.recursivelySearchElement(6, new int[]{1, 3, 5, 7}));
		assertEquals("Check that six is in the four element arrey and on which place.", -1, binaryChop.recursivelySearchElement(8, new int[]{1, 3, 5, 7}));
	}

}
