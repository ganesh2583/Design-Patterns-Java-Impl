package com.ganesh.patterns.observer;

public interface Observable {
	
	public void subscribe(Observer subscriber);
	public void notifyAllSubscribers();
	public void unsubscribe(Observer subscriber);

}
