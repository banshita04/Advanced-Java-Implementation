package com.autoboxingunboxing;

import java.util.ArrayList;

class IntWrapper{
	public int num;

	public IntWrapper(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("---Auto---");
		ArrayList<Integer> numberList = new ArrayList<>();
		numberList.add(33);//Auto boxing
		System.out.println(numberList.get(0));//Auto unboxing
		
		System.out.println("---Manual---");
		ArrayList<IntWrapper> numList = new ArrayList<>();
		numList.add(new IntWrapper(9));//Manual boxing
		System.out.println(numList.get(0).getNum());//Manual unboxing
	}
}
