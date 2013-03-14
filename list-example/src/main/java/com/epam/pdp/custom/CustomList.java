package com.epam.pdp.custom;

import java.util.AbstractList;
import java.util.ArrayList;

public class CustomList<T> extends AbstractList<T> {

	private final int START_LIST_POSITION = 0;
	private final int POSITION_TO_INSERT = 5;

	private ArrayList<T> elementsList;

	public CustomList() {
		elementsList = new ArrayList<T>(POSITION_TO_INSERT);
	}

	@Override
	public T get(int index) {
		return elementsList.get(index);
	}

	@Override
	public int size() {
		return elementsList.size();
	}

	@Override
	public boolean add(T e) {
		boolean sucess = false;
		ArrayList<T> temporaryList = new ArrayList<T>(elementsList.subList(START_LIST_POSITION,
				POSITION_TO_INSERT));
		sucess = temporaryList.add(e);
		temporaryList.addAll(elementsList.subList(POSITION_TO_INSERT,
				elementsList.size()));
		elementsList = temporaryList;		
		return sucess;
	}

}
