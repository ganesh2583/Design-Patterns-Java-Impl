package com.ganesh.patterns.strategy;

public class GCKListExecuter {

	public static void main(String[] args) {
		GCKList gckList = new GCKList(new AddItem(), new BinarySearch(), new QuickSort());
		gckList.addItem();
		gckList.searchItem();
		gckList.sortList();
		
	}
	
}
