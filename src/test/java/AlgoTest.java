package test.java;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import org.junit.Test;


import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
	SortDemoData dataTest = new SortDemoData();
	SortDemoData answer = new SortDemoData();
	
	/*
	 * The method is used to test bubble sort algorithm with test case 1 mentioned in the document.
	 * The goal is to achieve approx 90% node coverage, 75% condition and edge coverage for bubble sort method 
	 * with this test case.
	 * Test Case 1: {1, 2, 4, 7, 3, 5, 6}
	 */
	@Test 
	public void testCase1BubbleSort() {
		
		dataTest.initializeArray("1 2 4 7 3 5 6");
		answer.initializeArray("1 2 3 4 5 6 7");
		dataTest.runAlgo(0);
		
		//testing for length
		assertTrue(dataTest.myArray.length == answer.myArray.length);
		assertTrue(dataTest.myArray[0].key == answer.myArray[0].key);
		assertTrue(dataTest.myArray[1].key == answer.myArray[1].key);
		assertTrue(dataTest.myArray[2].key == answer.myArray[2].key);
		assertTrue(dataTest.myArray[3].key == answer.myArray[3].key);
		assertTrue(dataTest.myArray[4].key == answer.myArray[4].key);
		assertTrue(dataTest.myArray[5].key == answer.myArray[5].key);
		assertTrue(dataTest.myArray[6].key == answer.myArray[6].key);
		
	}
	
	/*
	 * The method is used to test bubble sort algorithm with test case 2 mentioned in the document.
	 * The goal is to achieve the rest of node coverage, condition and edge coverage for bubble sort method
	 * with this test case.
	 * Test Case 2: null
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testCase2BubbleSort() {
		SortAlgos.bubbleSort(null);
	}
	
	/*
	 * The method is used to test selection sort algorithm with test case 1 mentioned in the document.
	 * The goal is to achieve approx 90% node coverage, 75% condition and edge coverage for selection sort
	 * with this test case.
	 * Test Case 1: {1, 2, 4, 7, 3, 5, 6}
	 */
	@Test 
	public void testCase1SelectionSort() {
		
		dataTest.initializeArray("1 2 4 7 3 5 6");
		answer.initializeArray("1 2 3 4 5 6 7");
		dataTest.runAlgo(1);
		
		//testing for length
		assertTrue(dataTest.myArray.length == answer.myArray.length);
		assertTrue(dataTest.myArray[0].key == answer.myArray[0].key);
		assertTrue(dataTest.myArray[1].key == answer.myArray[1].key);
		assertTrue(dataTest.myArray[2].key == answer.myArray[2].key);
		assertTrue(dataTest.myArray[3].key == answer.myArray[3].key);
		assertTrue(dataTest.myArray[4].key == answer.myArray[4].key);
		assertTrue(dataTest.myArray[5].key == answer.myArray[5].key);
		assertTrue(dataTest.myArray[6].key == answer.myArray[6].key);
		
	}
	
	/*
	 * The method is used to test bubble sort algorithm with test case 2 mentioned in the document.
	 * The goal is to achieve the rest of node coverage, condition and edge coverage for selection sort 
	 * method with this test case.
	 * Test Case 2: null
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testCase2SelectionSort() {
		SortAlgos.selectionSort(null);
	}
	
	/*
	 * The method is used to test insertion sort algorithm with test case 1 mentioned in the document.
	 * The goal is to achieve approx 90% node coverage, 75% condition and edge coverage for insertion sort 
	 * method with this test case.
	 * Test Case 1: {1, 2, 4, 7, 3, 5, 6}
	 */
	@Test 
	public void testCase1InsertionSort() {
		
		dataTest.initializeArray("1 2 4 7 3 5 6");
		answer.initializeArray("1 2 3 4 5 6 7");
		dataTest.runAlgo(2);
		//testing for length
		assertTrue(dataTest.myArray.length == answer.myArray.length);
		assertTrue(dataTest.myArray[0].key == answer.myArray[0].key);
		assertTrue(dataTest.myArray[1].key == answer.myArray[1].key);
		assertTrue(dataTest.myArray[2].key == answer.myArray[2].key);
		assertTrue(dataTest.myArray[3].key == answer.myArray[3].key);
		assertTrue(dataTest.myArray[4].key == answer.myArray[4].key);
		assertTrue(dataTest.myArray[5].key == answer.myArray[5].key);
		assertTrue(dataTest.myArray[6].key == answer.myArray[6].key);
		
	}
	
	/*
	 * The method is used to test insertion sort algorithm with test case 2 mentioned in the document.
	 * The goal is to achieve the rest of node coverage, condition and edge coverage for insertion sort 
	 * method with this test case.
	 * Test Case 2: null
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testCase2InsertionSort() {
		SortAlgos.insertionSort(null);
	}
	
	/*
	 * The method is used to test merge sort algorithm with test case 1 mentioned in the document
	 * The goal is to achieve approx 90% node coverage, 75% condition and edge coverage for merge sort
	 * method with this test case.
	 * Test Case 1: {1, 2, 4, 7, 3, 5, 6}
	 */
	@Test 
	public void testCase1MergeSort() {
		
		dataTest.initializeArray("1 2 4 7 3 5 6");
		answer.initializeArray("1 2 3 4 5 6 7");
		dataTest.runAlgo(3);
		
		//testing for length
		assertTrue(dataTest.myArray.length == answer.myArray.length);
		assertTrue(dataTest.myArray[0].key == answer.myArray[0].key);
		assertTrue(dataTest.myArray[1].key == answer.myArray[1].key);
		assertTrue(dataTest.myArray[2].key == answer.myArray[2].key);
		assertTrue(dataTest.myArray[3].key == answer.myArray[3].key);
		assertTrue(dataTest.myArray[4].key == answer.myArray[4].key);
		assertTrue(dataTest.myArray[5].key == answer.myArray[5].key);
		assertTrue(dataTest.myArray[6].key == answer.myArray[6].key);
		
	}
	
	/*
	 * The method is used to test merge sort algorithm with test case 2 mentioned in the document.
	 * The goal is to achieve the rest of node coverage, condition and edge coverage for merge sort
	 * method with this test case.
	 * Test Case 2: null
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testCase2MergeSort() {
		SortAlgos.mergeSort(null);
	}
	
	/*
	 * The method is used to test quick sort algorithm with test case 1 mentioned in the document.
	 * The goal is to achieve approx 90% node coverage, 75% condition and edge coverage for quick sort
	 * method with this test case.
	 * Test Case 1: {1, 2, 4, 7, 3, 5, 6}
	 */
	
	@Test 
	public void testCase1QuickSort() {
		
		dataTest.initializeArray("1 2 4 7 3 5 6");
		answer.initializeArray("1 2 3 4 5 6 7");
		dataTest.runAlgo(4);
		//testing for length
		assertTrue(dataTest.myArray.length == answer.myArray.length);
		assertTrue(dataTest.myArray[0].key == answer.myArray[0].key);
		assertTrue(dataTest.myArray[1].key == answer.myArray[1].key);
		assertTrue(dataTest.myArray[2].key == answer.myArray[2].key);
		assertTrue(dataTest.myArray[3].key == answer.myArray[3].key);
		assertTrue(dataTest.myArray[4].key == answer.myArray[4].key);
		assertTrue(dataTest.myArray[5].key == answer.myArray[5].key);
		assertTrue(dataTest.myArray[6].key == answer.myArray[6].key);
		
	}
	
	/*
	 * The method is used to test quick sort algorithm with test case 2 mentioned in the document.
	 * The goal is to achieve the rest of node coverage, condition and edge coverage for quick sort
	 * method with this test case.
	 * Test Case 2: null.
	 */
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testCase2QuickSort() {
		SortAlgos.quickSort(null);
	}
	
	/*
	 * The method is used to test heap sort algorithm with test case 1 mentioned in the document
	 * The goal is to achieve approx 90% node coverage, 75% condition and edge coverage for heap sort
	 * method with this test case.
	 * Test Case 1: {1, 2, 4, 7, 3, 5, 6}
	 */
	
	@Test 
	public void testCase1HeapSort() {
		
		dataTest.initializeArray("1 2 4 7 3 5 6");
		answer.initializeArray("1 2 3 4 5 6 7");
		dataTest.runAlgo(5);
		//testing for length
		assertTrue(dataTest.myArray.length == answer.myArray.length);
		assertTrue(dataTest.myArray[0].key == answer.myArray[0].key);
		assertTrue(dataTest.myArray[1].key == answer.myArray[1].key);
		assertTrue(dataTest.myArray[2].key == answer.myArray[2].key);
		assertTrue(dataTest.myArray[3].key == answer.myArray[3].key);
		assertTrue(dataTest.myArray[4].key == answer.myArray[4].key);
		assertTrue(dataTest.myArray[5].key == answer.myArray[5].key);
		assertTrue(dataTest.myArray[6].key == answer.myArray[6].key);
		
	}
	
	/*
	 * The method is used to test heap sort algorithm with test case 2 mentioned in the document
	 * The goal is to achieve the rest of node coverage, condition and edge coverage for heap sort
	 * method with this test case.
	 * Test Case 2: null.
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testCase2HeapSort() {
		SortAlgos.heapSort(null);
	}

}
