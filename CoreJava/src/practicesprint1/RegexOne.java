package practicesprint1;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your PAN number");
		String pan = sc.next();
		
		String panPattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		Pattern p = Pattern.compile(panPattern);
		Matcher m = p.matcher(pan);
		
		if(m.matches()) {
			System.out.println("Enter your E-mail ID");
			String email = sc.next();
			
			String emailPattern = "([a-z]{5,10})(@digitec.com)?";
			Pattern p1 = Pattern.compile(emailPattern);
			Matcher m1 = p1.matcher(email);
			
			if(m1.matches()) {
				System.out.println("Profile of "+name+" updated successfully");
			}else {
				System.out.println("Invalid E-mail ID");
			}
		}else {
			System.out.println(pan+" is an invalid PAN number");
		}
	}

}
