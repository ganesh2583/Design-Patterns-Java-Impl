package com.ganesh.patterns.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Stocks implements Observable{
	
	private int stockPrice;
	private String stockName;
	
	private ArrayList<Observer> subscribersList = new ArrayList<Observer>();

	@Override
	public void subscribe(Observer subscriber) {
		if(subscriber != null)
			subscribersList.add(subscriber);
	}

	@Override
	public void notifyAllSubscribers() {
		for (Iterator<Observer> iterator = subscribersList.iterator(); iterator.hasNext();) {
			Observer observer = (Observer) iterator.next();
			observer.getNotifications(this);
		}
	}

	@Override
	public void unsubscribe(Observer subscriber) {
		if(subscriber != null)
			subscribersList.remove(subscriber);
		
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
		this.notifyAllSubscribers();
	}

}
