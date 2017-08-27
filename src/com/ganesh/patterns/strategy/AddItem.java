package com.ganesh.patterns.strategy;

public class AddItem implements AddingItemStrategy{

	@Override
	public void add() {
		System.out.println("Item added");
	}

}
