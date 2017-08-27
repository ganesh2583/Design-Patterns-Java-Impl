package com.ganesh.patterns.strategy;

public class QuickSort implements SortingStrategy{

	@Override
	public GCKList sort() {
		System.out.println("Quick Sorted");
		return new GCKList();
	}

}
