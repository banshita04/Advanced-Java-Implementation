package com.enums;

public enum Learning {
	COREJAVA(10), COLLECTION(20),GENERICS(30), JSP(40), MULTITHREADING(50);//1
	private int i;//3
	Learning(int i) {//2
		this.i = i;
	}
	public int getI() {//4
		return i;
	}
	
}
