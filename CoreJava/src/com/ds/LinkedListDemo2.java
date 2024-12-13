package com.ds;


import java.util.Scanner;

public class LinkedListDemo2 {
	Node start = null;
	public static void main(String[] args) {

		LinkedListDemo2 demo=new LinkedListDemo2();
		Scanner scanner=new Scanner(System.in);

		do {

			System.out.println("1. Add");
			System.out.println("2. Add By position");
			System.out.println("3. Display All");
			System.out.println("4. Search");
			System.out.println("5. Remove By position");
			System.out.println("6. Remove By element");
			System.out.println("7. Print Reverse");
			System.out.println("8. Reverse List");
			System.out.println("9. Exit");

			System.out.println("Enter the choice");
			int ch=scanner.nextInt();

			int element=0;

			switch (ch) {
			case 1: 
				System.out.println("Enter the element");
				element=scanner.nextInt();
				demo.add(element);
				break;

			case 2:			
				System.out.println("Enter the element");
				element=scanner.nextInt();
				System.out.println("Enter the position");
				int pos=scanner.nextInt();
				demo.addByPosition(element,pos);
				break;

			case 3:
				demo.displayAll();
				break;

			case 4:
				System.out.println("Enter the element to search");
				element=scanner.nextInt();
				demo.search(element);
				break;

			case 5:
				System.out.println("Enter the position to remove");
				pos=scanner.nextInt();
				demo.removeByPosition(pos);
				break;

			case 6:
				System.out.println("Enter the element to remove");
				element = scanner.nextInt();
				demo.remove(element);
				break;

			case 7:
				demo.printReverseList();
				break;

			case 8:
				demo.reverseList();
				break;

			case 9:
				System.out.println("Thank you");
				break;

			default:
				System.out.println("Wrong choice");
			}

			if(ch == 9)
				break;

		}while(true);
	}

	private void removeByPosition(int pos) {
		// TODO Auto-generated method stub
		Node e = start;
		int pos1 = 1;
		if(pos == 1) {
			start = e.next;
		}else {
			while(e!=null) {
				if(pos1 == (pos-1)) {
					e.next = e.next.next;
					break;
				}
				e = e.next;
				pos1++;
			}
		}

	}

	private void printReverseList() {
		// TODO Auto-generated method stub

		Node e = start;
		int size = 0;
		while(e!=null) {
			size++;
			e = e.next;
		}
		System.out.println(size);

		Node q = start;
		while(q!=null) {
			Node p = start;
			for(int i = 1; i <= size; i++, size--) {
				p = p.next;
			}
			System.out.print(p.data+"->");
			q = q.next;
		}
		System.out.println();

	}

	private void remove(int element) {
		// TODO Auto-generated method stub
		Node e = start;
		if(e.data == element) {
			start = e.next;
		}else {
			while(e!=null) {
				if(e.next.data == element) {
					e.next = e.next.next;
					break;
				}
				e = e.next;
			}
		}

	}

	private void reverseList() {
		Node prev = null;
		Node q = start;
		Node next = null;

		while(q!=null) {
			next = q.next;
			q.next = prev;

			prev = q;
			q = next;
		}
		start = prev;


	}

	private void search(int element) {
		// TODO Auto-generated method stub
		Node e = start;
		int pos = 1;
		if(start == null) {
			System.out.println("Object not found");
		}else {
			while(e != null) {
				if(e.data==element) {
					System.out.println("Object found at position "+pos);
					break;
				}else {
					pos++;
					e = e.next;
				}
			}
			if(e==null)
				System.out.println("Object not found");

		}

	}

	private void displayAll() {
		// TODO Auto-generated method stub

		if(start == null) {
			System.out.println("The list is empty");
		}
		else {
			Node q = start;
			while(q != null) {
				System.out.print(q.data+"->");
				q = q.next;
			}
		}
		System.out.println();
	}

	private void addByPosition(int element, int pos) {
		// TODO Auto-generated method stub

		Node e = new Node(element);
		if(pos == 0) { //to add element at index 0
			e.next = start;
			start = e;
		}else {
			Node q = start;
			for(int i = 1; i < pos; i++) {
				q = q.next;
			}
			e.next = q.next;
			q.next = e;
		}

	}

	private void add(int element) {
		// TODO Auto-generated method stub
		Node e = new Node(element);
		if(start == null) { //if the list is empty
			start = e;
		}else {
			Node q = start;
			while(q.next != null) { //to find the last element
				q = q.next;
			}
			q.next = e; //added @ the end
		}

	}
}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
