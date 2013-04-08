package com.epam.pdp.custom;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class CustomListTest {
	
	private static final String TEST_STRING = "TEST";
	private static final String SECOND_TEST_STRING = "TEST_2";
	private static final int POSITION_TO_INSERT = 5;
	private static final String LINE = "--------------------"; 

	@Test
	public void testSize() {
		System.out.println("testSize():");		
		List<String> customList = new CustomList<String>();
		assertEquals(POSITION_TO_INSERT, customList.size());
		System.out.print("Empty list: ");
		System.out.println(customList.toString());
		System.out.println("Added element: " + TEST_STRING);
		customList.add(TEST_STRING);
		assertEquals(POSITION_TO_INSERT + 1, customList.size());
		customList.add(SECOND_TEST_STRING);
		System.out.println("Added element: " + SECOND_TEST_STRING);
		assertEquals(POSITION_TO_INSERT + 2, customList.size());		
		System.out.print("List with added elements: ");
		System.out.println(customList.toString());
		System.out.println(LINE);
	}

	@Test
	public void testRemoveRange() {		
		System.out.println("testRemoveRange():");
		System.out.println(LINE);
	}

	@Test
	public void testCustomList() {
		System.out.println("testCustomList()");
		List<String> customList = new CustomList<String>();
		assertEquals(POSITION_TO_INSERT, customList.size());
		System.out.println(LINE);
	}

	@Test
	public void testGetInt() {
		System.out.println("testGetInt():");
		List<String> customList = new CustomList<String>();
		customList.add(TEST_STRING);
		String element = customList.get(POSITION_TO_INSERT);
		assertEquals(TEST_STRING, element);
		for (int index = 0; index < 5; index++) {
			element = customList.get(index);
			assertNull(element);
		}
		System.out.println(LINE);
	}

	@Test
	public void testAddT() {
		System.out.println("testAddT()");
		List<String> customList = new CustomList<String>();
		assertEquals(POSITION_TO_INSERT, customList.size());
		customList.add(TEST_STRING);
		assertEquals(POSITION_TO_INSERT + 1, customList.size());
		assertEquals(TEST_STRING, customList.get(POSITION_TO_INSERT));
		customList.add(SECOND_TEST_STRING);
		assertEquals(POSITION_TO_INSERT + 2, customList.size());
		assertEquals(SECOND_TEST_STRING, customList.get(POSITION_TO_INSERT));
		System.out.println(LINE);
	}

	@Test
	public void testAddIntT() {
		System.out.println("testAddIntT()");
		List<String> customList = new CustomList<String>();
		int firstPositionToInsert = 0;
		int secondPositionToInsert = 5;
		customList.add(firstPositionToInsert, TEST_STRING);
		System.out.println("Inserted to postion: " + firstPositionToInsert);
		customList.add(secondPositionToInsert, SECOND_TEST_STRING);
		System.out.println("Inserted to postion: " + secondPositionToInsert);
		assertEquals(TEST_STRING, customList.get(firstPositionToInsert));
		assertEquals(SECOND_TEST_STRING, customList.get(secondPositionToInsert));
		System.out.println(customList);		
		System.out.println(LINE);
	}

	@Test
	public void testRemoveInt() {
		System.out.println("testRemoveInt()");
//		List<String> customList = new CustomList<String>();
//		customList.add(TEST_STRING);
//		System.out.println("S-------------------------");
//		customList.add(1, TEST_STRING);
//		customList.remove(6);
//		System.out.println(customList);		
//		System.out.println("S-------------------------");
		
		//TODO: Implement
		////TODO: Implement
		System.out.println(LINE);
	}

	@Test
	public void testRemoveObject() {
		//TODO: Implement
	}

	@Test
	public void testRemoveAllCollectionOfQ() {
		//TODO: Implement
	}

	@Test
	public void testHashCode() {
		//TODO: Implement
	}

	@Test
	public void testEquals() {
		//TODO: Implement
	}

	@Test
	public void testIterator() {
		//TODO: Implement
	}

	@Test
	public void testAddE() {
		//TODO: Implement
	}

	@Test
	public void testClear() {
		//TODO: Implement
	}

	@Test
	public void testAbstractList() {
		//TODO: Implement
	}

	@Test
	public void testGetInt1() {
		//TODO: Implement
	}

	@Test
	public void testSet() {
		//TODO: Implement
	}

	@Test
	public void testAddIntE() {
		//TODO: Implement
	}

	@Test
	public void testRemoveInt1() {
		//TODO: Implement
	}

	@Test
	public void testIndexOf() {
		//TODO: Implement
	}

	@Test
	public void testLastIndexOf() {
		//TODO: Implement
	}

	@Test
	public void testAddAllIntCollectionOfQextendsE() {
		//TODO: Implement
	}

	@Test
	public void testListIterator() {
		//TODO: Implement
	}

	@Test
	public void testListIteratorInt() {
		//TODO: Implement
	}

	@Test
	public void testSubList() {
		//TODO: Implement
	}

	@Test
	public void testToString() {
		//TODO: Implement
	}

	@Test
	public void testAbstractCollection() {
		//TODO: Implement
	}

	@Test
	public void testIsEmpty() {
		//TODO: Implement
	}

	@Test
	public void testContains() {
		//TODO: Implement
	}

	@Test
	public void testToArray() {
		//TODO: Implement
	}

	@Test
	public void testToArrayTArray() {
		//TODO: Implement
	}

	@Test
	public void testRemoveObject1() {
		//TODO: Implement
	}

	@Test
	public void testContainsAll() {
		//TODO: Implement
	}

	@Test
	public void testAddAllCollectionOfQextendsE() {
		//TODO: Implement
	}

	@Test
	public void testRemoveAllCollectionOfQ1() {
		//TODO: Implement
	}

	@Test
	public void testRetainAll() {
		//TODO: Implement
	}

}
