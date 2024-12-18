package com.generics;
/* T - Type
 * E - Element
 * K - Key
 * N - Number
 * V - Value
 * */
class Datas<K extends Integer,V>{
	
	private K key;
	private V value;
	
	public Datas(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Datas [key=" + key + ", value=" + value + "]";
	}
	
	public <N extends Number, E>void display(E element, N number) {
		System.out.println("Element: "+element+"\nNumber: "+number);
	}
	
	
}
public class TypeOfParameters {
	public static void main(String[] args) {
		Datas<Integer, String> data = new Datas<Integer, String>(10, "Banshita");
		System.out.println("Key: "+data.getKey()+"\nValue: "+data.getValue());
		data.display("Test", 94);
	}
	
}
