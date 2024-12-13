package practicesprint1;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students");
		int num = sc.nextInt();
		
		if(num>0) {
			String details[] = new String[num];

			System.out.println("Enter the details");
			for(int i = 0; i < num; i++) {
				details[i] = sc.next();
			}
		
			for(int i = 0; i < num; i++) {
				ClassHouseFormation chf = new ClassHouseFormation();
				chf.addName(details[i]);
				HashSet<String> set = chf.formTeam();
				Iterator<String> itr = set.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
			}
		}else {
			System.out.println("Invalid input");
		}
		
		
	}
}
