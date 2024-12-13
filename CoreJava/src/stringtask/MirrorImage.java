package stringtask;

import java.util.Scanner;

public class MirrorImage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		MirrorImage mi = new MirrorImage();
		System.out.println(s+"|"+mi.getImage(s));
	}
	String getImage(String s){
		String newStr = "";
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			newStr = ch+newStr;
		}
		return newStr;
	}
}
