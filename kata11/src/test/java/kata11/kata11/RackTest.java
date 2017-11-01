package kata11.kata11;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RackTest {
	
	@Test
	public void test_of_sorting_balls() {
		
	Rack rack = new Rack();
	
	assertArrayEquals("Test when no winnig number", new int [] {}, new int [] {});
	assertArrayEquals("Test when one winnig number", new int []{20}, rack.addBalls(new int [] {20}));
	assertArrayEquals("Test when two winig number", new int []{10, 20}, rack.addBalls(new int [] {20, 10}));
	assertArrayEquals("Test when three winig number", new int []{10, 20, 30}, rack.addBalls(new int [] {20, 10, 30}));
	
	assertArrayEquals("Test when six winig number", new int[] { 6, 16, 26, 36, 46, 56}, rack.addBalls(new int[] { 56, 6, 46, 36, 26, 16}));		
	}

}
