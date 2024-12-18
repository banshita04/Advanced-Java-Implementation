package lambdaexpressions.geeksforgeeks;

import java.util.function.Predicate;

public class IsStringEmpty {

	public static void main(String[] args) {
		
		String s = "banshita";
		CheckEmpty checkEmpty = str->str.isEmpty();
		
		if(checkEmpty.emptyString(s)) {
			System.out.println("The string is empty");
		}else {
			System.out.println("The string is not empty");
		}
		
		Predicate<String> isEmptyString = st -> st.isEmpty();
		if(isEmptyString.test(s)) {
			System.out.println("The string is empty");
		}else {
			System.out.println("The string is not empty");
		}
		
		
	}

}
