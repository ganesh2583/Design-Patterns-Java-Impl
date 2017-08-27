package com.ganesh.patterns.observer;

public class Mobile implements Observer{

	@Override
	public void getNotifications(Observable observableObj) {
		Stocks stock = (Stocks)observableObj;
		System.out.println("Mobile - Stock name: "+stock.getStockName() + " Stock price: "+stock.getStockPrice());
	}

}
