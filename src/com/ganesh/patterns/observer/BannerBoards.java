package com.ganesh.patterns.observer;

public class BannerBoards implements Observer{

	@Override
	public void getNotifications(Observable observableObj) {
		Stocks stock = (Stocks)observableObj;
		System.out.println("Banner Board - Stock name: "+stock.getStockName() + " Stock price: "+stock.getStockPrice());
	}

}
