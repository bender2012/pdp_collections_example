package com.epam.pdp.custom;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class CustomListTest {

	private static final String TEST_STRING = "TEST";
	private static final int POSITION_TO_INSERT = 5;

	@Test
	public void testSize() {
		List<String> customList = new CustomList<String>();
		assertEquals(POSITION_TO_INSERT, customList.size());
		customList.add(TEST_STRING);
		assertEquals(POSITION_TO_INSERT + 1, customList.size());
	}

	@Test
	public void testRemoveRange() {
		// fail("Not yet implemented");
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
		// fail("Not yet implemented");
	}

	@Test
	public void testRemoveInt() {
		// fail("Not yet implemented");
	}

	@Test
	public void testRemoveObject() {
		// fail("Not yet implemented");
	}

	@Test
	public void testRemoveAllCollectionOfQ() {
		// fail("Not yet implemented");
	}

}
