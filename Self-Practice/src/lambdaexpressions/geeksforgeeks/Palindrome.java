package lambdaexpressions.geeksforgeeks;

import java.util.function.Predicate;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";
		
		Predicate<String> isPalindrome = s ->{
			String rev = "";
			for (int i = 0; i < s.length(); i++) {
				rev = s.charAt(i) +rev;
			}
			if(rev.equals(s))
				return true;
			else
				return false;
		};
		
		System.out.println("Palindrome: "+isPalindrome.test(str));
	}
}
