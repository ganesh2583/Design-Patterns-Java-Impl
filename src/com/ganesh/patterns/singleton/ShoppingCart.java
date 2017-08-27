package com.ganesh.patterns.singleton;

public class ShoppingCart {
	
	//private static ShoppingCart shoppingCart =  null;
	
	
	private ShoppingCart(){
		
	}
	
	private static class ShoppingCartHelper {
		private static final ShoppingCart shoppingCart =  new ShoppingCart();
	}
	
	public static ShoppingCart getInstance(){
		/*if(shoppingCart == null){
			shoppingCart = new ShoppingCart();
		}
		return shoppingCart;*/
		
		return ShoppingCartHelper.shoppingCart;
	}

}
