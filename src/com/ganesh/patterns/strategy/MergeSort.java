package com.ganesh.patterns.strategy;

public class MergeSort implements SortingStrategy{

	@Override
	public GCKList sort() {
		System.out.println("Merge Sorted");
		return new GCKList();
	}

}
