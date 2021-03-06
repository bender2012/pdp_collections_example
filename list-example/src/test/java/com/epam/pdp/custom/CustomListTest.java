package com.epam.pdp.custom;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
		int positioToInsert = 1;
		int firstRemovePosition = 6;
		System.out.println("testRemoveInt()");
		List<String> customList = new CustomList<String>();
		System.out.println("Inserting " + TEST_STRING);
		customList.add(TEST_STRING);
		System.out.println(customList);
		System.out.println("Inserting " + TEST_STRING + " to position "
				+ positioToInsert);
		customList.add(positioToInsert, TEST_STRING);
		System.out.println(customList);
		System.out.println("Removeing from position: " + firstRemovePosition);
		customList.remove(firstRemovePosition);
		System.out.println(customList);
		System.out.println("Removeing from position: " + positioToInsert);
		customList.remove(positioToInsert);
		System.out.println(customList);
		System.out.println(LINE);
	}

	@Test
	public void testRemoveObject() {
		int positionToInsert = 3;
		System.out.println("testRemoveObject()");
		List<String> customList = new CustomList<String>();
		System.out.println(customList);
		System.out.println("Inserting " + TEST_STRING);
		customList.add(TEST_STRING);
		System.out.println(customList);
		System.out.println("Removeing " + TEST_STRING);
		customList.remove(TEST_STRING);
		System.out.println(customList);
		System.out.println("Inserting " + TEST_STRING + " to position "
				+ positionToInsert);
		customList.add(positionToInsert, TEST_STRING);
		System.out.println(customList);
		System.out.println("Removeing " + TEST_STRING);
		customList.remove(TEST_STRING);
		System.out.println(customList);
		assertEquals(false, customList.contains(TEST_STRING));
		System.out.println(LINE);
	}

	@Test
	public void testRemoveAllCollectionOfQ() {
		List<String> customList = new CustomList<String>();
		Set<String> collectionToRemove = new HashSet<String>();
		customList.add(TEST_STRING);
		collectionToRemove.add(TEST_STRING);
		customList.add(SECOND_TEST_STRING);
		collectionToRemove.add(SECOND_TEST_STRING);
		customList.removeAll(collectionToRemove);
		assertEquals(false, customList.contains(TEST_STRING));
		assertEquals(false, customList.contains(SECOND_TEST_STRING));
	}

	@Test
	public void testHashCode() {
		int hashCodeBefore = 0;
		int hashCodeAfter = 0;
		List<String> customList = new CustomList<String>();
		hashCodeBefore = customList.hashCode();
		customList.add(TEST_STRING);
		hashCodeAfter = customList.hashCode();
		assertNotSame(hashCodeBefore, hashCodeAfter);
	}

	@Test
	public void testEquals() {
		List<String> firstList = new CustomList<String>();
		List<String> secondList = new CustomList<String>();
		assertEquals(firstList, secondList);
		secondList.add(TEST_STRING);
		firstList.add(TEST_STRING);
		assertEquals(firstList, secondList);
	}

	@Test
	public void testIterator() {
		int counter = 0;
		List<String> customList = new CustomList<String>();
		Iterator<String> iterator = customList.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			counter++;
		}
		assertEquals(POSITION_TO_INSERT, counter);
		customList.add(TEST_STRING);
		counter = 0;
		iterator = customList.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			counter++;
		}
		assertEquals(POSITION_TO_INSERT + 1, counter);
	}

	@Test
	public void testAddE() {
		List<String> customList = new CustomList<String>();
		assertEquals(POSITION_TO_INSERT, customList.size());
		customList.add(TEST_STRING);
		assertEquals(POSITION_TO_INSERT + 1, customList.size());
		assertEquals(TEST_STRING, customList.get(POSITION_TO_INSERT));
	}

	@Test
	public void testClear() {
		List<String> customList = new CustomList<String>();
		customList.add(TEST_STRING);
		customList.clear();
		assertNull(customList.get(POSITION_TO_INSERT - 1));
	}

	@Test
	public void testSet() {
		int testPosition = 0;
		List<String> customList = new CustomList<String>();
		assertEquals(null, customList.get(testPosition));
		assertEquals(null, customList.set(0, TEST_STRING));
		assertEquals(TEST_STRING, customList.get(testPosition));
	}

	@Test
	public void testAddIntE() {
		int positionToAdd = 3;
		List<String> customList = new CustomList<String>();
		assertEquals(POSITION_TO_INSERT, customList.size());
		customList.add(positionToAdd, TEST_STRING);
		assertEquals(TEST_STRING, customList.get(positionToAdd));
		assertEquals(POSITION_TO_INSERT + 1, customList.size());
	}

	@Test
	public void testIndexOf() {
		List<String> customList = new CustomList<String>();
		customList.add(TEST_STRING);
		customList.add(SECOND_TEST_STRING);
		assertEquals(POSITION_TO_INSERT + 1, customList.indexOf(TEST_STRING));
	}

	@Test
	public void testLastIndexOf() {
		List<String> customList = new CustomList<String>();
		customList.add(TEST_STRING);
		customList.add(SECOND_TEST_STRING);
		assertEquals(POSITION_TO_INSERT,
				customList.lastIndexOf(SECOND_TEST_STRING));
		assertEquals(POSITION_TO_INSERT + 1,
				customList.lastIndexOf(TEST_STRING));
	}

	@Test
	public void testAddAllIntCollectionOfQextendsE() {
		List<String> customList = new CustomList<String>();
		Set<String> testSet = new HashSet<String>();
		testSet.add(TEST_STRING);
		testSet.add(SECOND_TEST_STRING);
		customList.addAll(testSet);
		for (String setEntry : testSet) {
			assertTrue(customList.contains(setEntry));
		}
	}

	@Test
	public void testSubList() {		
		int expectedListSize = 3;
		int fromIndex = POSITION_TO_INSERT - 2;
		int toIndex = POSITION_TO_INSERT + 1;
		List<String> customList = new CustomList<String>();
		customList.add(TEST_STRING);
		List<String> sublist = new ArrayList<String>();
		sublist = customList.subList(fromIndex, toIndex);
		assertEquals(expectedListSize, sublist.size());
		assertEquals(null, sublist.get(0));
		assertEquals(null, sublist.get(1));
		assertEquals(TEST_STRING, sublist.get(2));
	}

	@Test
	public void testToString() {
		System.out.println("testToString(): ");
		String emptyListString = "[null, null, null, null, null]";
		String listWithElementsString = "[null, null, null, null, null, TEST_2, TEST]";
		List<String> customList = new CustomList<String>();
		assertEquals(emptyListString, customList.toString());
		customList.add(TEST_STRING);
		customList.add(SECOND_TEST_STRING);
		assertEquals(listWithElementsString, customList.toString());
		System.out.println(customList);
		System.out.println(LINE);
	}

	@Test
	public void testIsEmpty() {
		List<String> customList = new CustomList<String>();
		assertTrue(customList.isEmpty());
		customList.add(TEST_STRING);
		assertFalse(customList.isEmpty());
	}

	@Test
	public void testContains() {
		List<String> customList = new CustomList<String>();
		assertFalse(customList.contains(TEST_STRING));
		customList.add(TEST_STRING);
		assertTrue(customList.contains(TEST_STRING));
	}

	@Test
	public void testToArray() {
		int testArraySize = 6;
		List<String> customList = new CustomList<String>();
		customList.add(TEST_STRING);
		Object[] testArray = new Object[testArraySize];
		for (int i = 0; i < POSITION_TO_INSERT; i++) {
			testArray[i] = null;
		}
		testArray[testArraySize - 1] = TEST_STRING;
		Object[] customArrayFromList = customList.toArray();
		assertEquals(testArraySize, customArrayFromList.length);
		for (int i = 0; i < testArraySize; i++) {
			assertEquals(testArray[i], customArrayFromList[i]);
		}
	}

	@Test
	public void testToArrayTArray() {
		List<String> customList = new CustomList<String>();
		customList.add(TEST_STRING);
		String[] testArayFromList = customList
				.toArray(new String[POSITION_TO_INSERT + 1]);
		for (int i = 0; i < POSITION_TO_INSERT; i++) {
			assertNull(testArayFromList[i]);
		}
		assertEquals(TEST_STRING, testArayFromList[POSITION_TO_INSERT]);
	}

	@Test
	public void testContainsAll() {
		List<String> customList = new CustomList<String>();
		List<String> testList = new ArrayList<String>();
		testList.add(TEST_STRING);
		testList.add(SECOND_TEST_STRING);
		testList.add(null);
		assertFalse(customList.containsAll(testList));
		customList.add(TEST_STRING);
		customList.add(SECOND_TEST_STRING);
		assertTrue(customList.containsAll(testList));
	}

	@Test
	public void testAddAllCollectionOfQextendsE() {
		List<String> customList = new CustomList<String>();
		Collection<String> testCollection = new HashSet<String>();		
		testCollection.add(TEST_STRING);
		testCollection.add(SECOND_TEST_STRING);		
		assertFalse(customList.containsAll(testCollection));				
		assertTrue(customList.addAll(testCollection));		
		assertTrue(customList.containsAll(testCollection));		
	}

	@Test
	public void testRetainAll() {
		List<String> customList = new CustomList<String>();
		Collection<String> testCollection = new HashSet<String>();
		testCollection.add(null);
		testCollection.add(TEST_STRING);
		testCollection.add(SECOND_TEST_STRING);
		customList.add(TEST_STRING);		
		customList.retainAll(testCollection);		
		assertEquals(POSITION_TO_INSERT + 1, customList.size());
		assertTrue(customList.contains(TEST_STRING));
	}

}
