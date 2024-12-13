package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PhoneBook {
	HashMap<String, List<Integer>> directory=new HashMap<>();
	public static void main(String[] args) {
		PhoneBook p=new PhoneBook();
		p.add("Manisha", 3453466);
		p.add("Manisha", 45454545);
		p.add("Swati", 566);
		List<Integer> nums = p.searchByName("Manisha");
		nums.forEach(c->System.out.println(c));
		p.displayAllNameWithPhoneNos();
	}
	void add(String name, int phoneNo) {
		//add in the map 
		//if key (name)is not present create a list add the phone no and add in the map
		//if  key (name) is already present add the phone no in the corresponding list

		if(directory.containsKey(name)) {
			for(Map.Entry<String, List<Integer>> l : directory.entrySet()) {
				String s = l.getKey();
				if(l.getKey().equals(name)) {
//				System.out.println("Inside the equal");
					l.getValue().add(phoneNo);
//					v.add(phoneNo);
				}
			}
		}else if(!(directory.containsKey(name))) {
//			System.out.println("Inside the not equal");
			List<Integer> nlist = new ArrayList<>();
			nlist.add(phoneNo);
			directory.put(name, nlist);
		}

	}
	List<Integer> searchByName(String name){
		List<Integer> li = null;
		for(Map.Entry<String, List<Integer>> m : directory.entrySet()) {
			if(m.getKey().equals(name)) {
				li=m.getValue();
			}
		}
		return li;
	}
	void displayAllNameWithPhoneNos() {
		
		for(Map.Entry<String, List<Integer>> e : directory.entrySet()) {
			List<Integer> l = new ArrayList<>();
			String name = e.getKey();
			l = e.getValue();
			System.out.println(name+"->");
			l.forEach(c->System.out.println(c));
			
		}
		

	}

}