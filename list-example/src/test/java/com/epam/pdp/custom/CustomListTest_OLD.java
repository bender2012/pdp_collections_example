package com.epam.pdp.custom;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;

public class CustomListTest_OLD {
		
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
		customList.add(TEST_STRING);
		assertEquals(POSITION_TO_INSERT + 1, customList.size());
		customList.add(SECOND_TEST_STRING);
		assertEquals(POSITION_TO_INSERT + 2, customList.size());		
		System.out.print("List with added elements: ");
		System.out.println(customList.toString());
		System.out.println(LINE);
	}

	@Test
	public void testCustomList() {
		List<String> customList = new CustomList<String>();
		assertEquals(POSITION_TO_INSERT, customList.size());
	}

	@Test
	public void testGetInt() {
		List<String> customList = new CustomList<String>();
		customList.add(TEST_STRING);
		String element = customList.get(POSITION_TO_INSERT);
		assertEquals(TEST_STRING, element);
		for (int index = 0; index < 5; index++) {
			element = customList.get(index);
			assertNull(element);
		}
	}

	@Test
	public void testAddT() {
		List<String> customList = new CustomList<String>();
		assertEquals(POSITION_TO_INSERT, customList.size());
		customList.add(TEST_STRING);
		assertEquals(POSITION_TO_INSERT + 1, customList.size());
		assertEquals(TEST_STRING, customList.get(POSITION_TO_INSERT));
		customList.add(SECOND_TEST_STRING);
		assertEquals(POSITION_TO_INSERT + 2, customList.size());
		assertEquals(SECOND_TEST_STRING, customList.get(POSITION_TO_INSERT));		
	}

	@Test
	public void testRemoveInt() {
		List<String> customList = new CustomList<String>();
		customList.add(TEST_STRING);
		System.out.println("S-------------------------");
		customList.add(1, TEST_STRING);
		customList.remove(6);
		System.out.println(customList);		
		System.out.println("S-------------------------");
		
		//TODO: Implement
		//fail("Not yet implemented");
	}

	@Test
	public void testRemoveObject() {
		//TODO: Implement
		//fail("Not yet implemented");
	}

	@Test
	public void testRemoveAllCollectionOfQ() {
		//TODO: Implement
		//fail("Not yet implemented");
	}

}
