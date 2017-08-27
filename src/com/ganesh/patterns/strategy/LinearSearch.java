package com.ganesh.patterns.strategy;

public class LinearSearch implements SearchingStrategy{

	@Override
	public void search() {
		System.out.println("Linear search performed");
	}

}
