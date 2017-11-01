package kata11.kata11;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingCharTest {

	@Test
	public void test_of_sorting_chars() {
			
		CharSorter sorter = new CharSorter();
		
		String sorted = sorter.sort("When not studying nuclear physics, Bambi likes to play beach volleyball.");
		
		assertEquals("aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy", sorted);	
}
}