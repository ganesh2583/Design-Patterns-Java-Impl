package com.ganesh.patterns.singleton;

public class ShoppingCartUser {
	
	public static void main(String[] args) {
		for( int i = 0; i <= 5; i++){
			ShoppingCart shoppingCart = ShoppingCart.getInstance();
			System.out.println(shoppingCart.hashCode());
		}
	}

}
