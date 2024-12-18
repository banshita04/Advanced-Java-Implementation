package lambdaexpressions.geeksforgeeks;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UppercaseLowercaseMixedcase {
	public static void main(String[] args) {
		List<String> stringList = List.of("bob the builder","OSWALD","nOddy","pingu","THOMAS");
		
		Predicate<String> isUpperCase = s ->
		{
			return s.equals(s.toUpperCase());
		};
		
		Predicate<String> isLowerCase = s ->
		{
			return s.equals(s.toLowerCase());
		};
		
		Consumer<List<String>> check = strList -> {
			for (String str : stringList) {
				if(isUpperCase.test(str)) {
					System.out.println("UpperCase");
				}else if(isLowerCase.test(str)) {
					System.out.println("LowerCase");
				}else
					System.out.println("MixedCase");
			}
		};
		
		check.accept(stringList);
		
	}
	
}
