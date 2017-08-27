package com.ganesh.patterns.observer;

public class NotificationUserClass {
	
	public static void main(String[] args) {
		OracleStocks oracleStocks = new OracleStocks();
		MicrosoftStocks microsoftStocks = new MicrosoftStocks();
		Mobile mobile = new Mobile();
		BannerBoards bannerBoard = new BannerBoards();
		oracleStocks.subscribe(mobile);
		oracleStocks.subscribe(bannerBoard);
		microsoftStocks.subscribe(mobile);
		microsoftStocks.subscribe(bannerBoard);
		
		for(int i=0; i < 5; i++){
			oracleStocks.setStockName("Oracle Stock");
			oracleStocks.setStockPrice(100 * i);
			microsoftStocks.setStockName("Microsoft Stock");
			microsoftStocks.setStockPrice(150 * i);
		}
	}

}
