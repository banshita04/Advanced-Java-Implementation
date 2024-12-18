package lambdaexpressions.chatgpt;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonMain {
	public static void main(String[] args) {
		List<Person> personList = List.of(
				new Person("bob",32,"bangalore"),
				new Person("pam",30,"kolkata"),
				new Person("john",22,"bangalore"),
				new Person("lockey",20,"kolkata"),
				new Person("game",55,"bangalore"),
				new Person("pam",67,"kolkata"),
				new Person("jim",52,"bangalore"),
				new Person("steve",62,"kolkata"),
				new Person("pamela",19,"bangalore"),
				new Person("gary",32,"kolkata")
				);

		Map<String, Double> ageMap = getAverageAgeByCity(personList);

		for(Map.Entry<String, Double> entry: ageMap.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		

	}
	public static Map<String, Double> getAverageAgeByCity(List<Person> listOfPeople){

		return listOfPeople
				.stream()
				.filter(p->p
						.getAge()<50)
				.collect(Collectors
						.groupingBy(Person::getCity,
								Collectors
								.averagingInt(Person::getAge)));
	}
}
