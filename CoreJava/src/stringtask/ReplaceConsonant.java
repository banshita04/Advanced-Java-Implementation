package stringtask;

import java.util.Scanner;

public class ReplaceConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		ReplaceConsonant rc = new ReplaceConsonant();
		System.out.println(rc.alterString(s));
	}
	String alterString(String s) {
		String newStr = "";
		for(int i = 0; i < s.length(); i++) {
			if(i!=s.length()-1 && (s.charAt(i+1)=='a'||s.charAt(i+1)=='e'||s.charAt(i+1)=='i'||s.charAt(i+1)=='o'||
					s.charAt(i+1)=='u'||s.charAt(i+1)=='A'||s.charAt(i+1)=='E'
					||s.charAt(i+1)=='I'||s.charAt(i+1)=='O'||s.charAt(i+1)=='U')) {
				if(!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||
						s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'
						||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')) {
					if(s.charAt(i)=='z') {
						newStr=newStr+'a';
					}else if(s.charAt(i)=='Z') {
						newStr=newStr+'A';
					}else {
						int index = (int) s.charAt(i);
						char c = (char) (index+1);
						newStr=newStr+c;
					}
				}else {
					newStr=newStr+s.charAt(i);
				}
			}else {
				newStr=newStr+s.charAt(i);
			}
		}
		return newStr;
	}

}
