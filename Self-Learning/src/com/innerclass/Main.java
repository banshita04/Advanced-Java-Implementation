package com.innerclass;

public class Main {
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.shopStatus();
		shop.getLock().setLocking(false);
		shop.shopStatus();
	}
}
