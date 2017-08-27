package com.ganesh.patterns.strategy;

public class GCKList {
	
	AddingItemStrategy addingItemStrategy;
	SearchingStrategy searchingStrategy;
	SortingStrategy sortingStrategy;
	
	public GCKList(){
		
	}
	
	public GCKList(AddingItemStrategy addingItemStrategy, SortingStrategy sortingStrategy){
		this.addingItemStrategy = addingItemStrategy;
		this.sortingStrategy = sortingStrategy;
	}
	
	public GCKList(AddingItemStrategy addingItemStrategy, SearchingStrategy searchingStrategy, SortingStrategy sortingStrategy){
		this.addingItemStrategy = addingItemStrategy;
		this.searchingStrategy = searchingStrategy;
		this.sortingStrategy = sortingStrategy;
	}
	
	public void addItem(){
		addingItemStrategy.add();
	}
	
	public void searchItem(){
		searchingStrategy.search();
	}
	
	public void sortList(){
		sortingStrategy.sort();
	}

}
