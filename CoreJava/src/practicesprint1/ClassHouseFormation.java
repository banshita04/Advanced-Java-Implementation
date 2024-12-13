package practicesprint1;
import java.util.*;
public class ClassHouseFormation {
		HashSet<String> studSet = new HashSet<String>();
		
		public HashSet<String> getStudSet(){
			return studSet;
		}
		
		public void setStudSet(HashSet<String> studSet){
			this.studSet = studSet;
		}
		
		public void addName(String details) {
			String name[] = details.split(":");
			studSet.add(name[1]);
		}
		
		public HashSet<String> formTeam(){
			Iterator<String> itr = studSet.iterator();
			HashSet<String> newSet = new HashSet<>();
			while(itr.hasNext()) {
				String name = itr.next();
				if(name.charAt(0)>='A' && name.charAt(0)<='H')
					newSet.add(name+":RED");
				else if(name.charAt(0)>='I' && name.charAt(0)<='P')
					newSet.add(name+":BLUE");
				else if(name.charAt(0)>='Q' && name.charAt(0)<='Z')
					newSet.add(name+":GREEN");
			}
			return newSet;
		}
		
		
}
