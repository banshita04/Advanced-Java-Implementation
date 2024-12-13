package practicesprint1;
import java.util.*;
public class AlphabeticalOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = sc.nextLine();
		String s[] = str.split(" ");
		int check = 0;
		for(int i = 0; i < str.length(); i++) {
			if(!((str.charAt(i)>='a' && str.charAt(i)<='z') || str.charAt(i) == ' ')){
				System.out.println(str+" is an invalid input");
				check = 1;
				break;
			}
		}
		if(check == 1) {
			return;
		} else {
			for (int i = 0; i < s.length; i++) {
				char ch[] = s[i].toCharArray();
				Arrays.sort(ch);
				String words = new String(ch);
				System.out.print(words+" ");
			}
		}
	}
	
}
