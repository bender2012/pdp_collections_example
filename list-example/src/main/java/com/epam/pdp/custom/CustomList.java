package com.epam.pdp.custom;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;

public class CustomList<T> extends AbstractList<T> {

	private final int START_LIST_POSITION = 0;
	private final int POSITION_TO_INSERT = 5;

	private ArrayList<T> elementsList;

	public CustomList() {
		initCustomList();
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
		ArrayList<T> temporaryList = new ArrayList<T>(elementsList.subList(
				START_LIST_POSITION, POSITION_TO_INSERT));
		sucess = temporaryList.add(e);
		temporaryList.addAll(elementsList.subList(POSITION_TO_INSERT,
				elementsList.size()));
		elementsList = temporaryList;
		return sucess;
	}

	@Override
	public void add(int index, T element) {
		elementsList.add(index, element);
	}

	@Override
	public T remove(int index) {
		T removedElement = this.get(index);
		if (index > POSITION_TO_INSERT) {
			elementsList.remove(index);
		} else {
			this.elementsList.set(index, null);
		}
		return removedElement;
	}

	@Override
	public boolean remove(Object o) {
		boolean returnValue = false;
		for (int index = 0; index < this.elementsList.size(); index++) {
			if (o.equals(this.elementsList.get(index))) {
				this.elementsList.remove(index);
			}
		}
		return returnValue;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		boolean modified = false;
		for (Object element : c) {
			if (this.remove(element)) {
				modified = true;
			}
		}
		return modified;
	}

	@Override
	protected void removeRange(int fromIndex, int toIndex) {
		for (int index = fromIndex; index < toIndex; index++) {
			this.remove(index);
		}
	}

	@Override
	public void clear() {
		initCustomList();
	}

	@Override
	public T set(int index, T element) {
		return elementsList.set(index, element);
	}

	private void initCustomList() {
		elementsList = new ArrayList<T>();
		for (int index = 0; index < POSITION_TO_INSERT; index++) {
			elementsList.add(null);
		}
	}

}
