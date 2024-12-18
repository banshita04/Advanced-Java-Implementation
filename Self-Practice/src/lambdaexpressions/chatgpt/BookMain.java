package lambdaexpressions.chatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookMain {

	public static void main(String[] args) {

		List<Book> bookList = Arrays.asList(
				new Book("Book A", "Author 1", "Fantasy", 150),
				new Book("Book B", "Author 2", "Fantasy", 300),
				new Book("Book C", "Author 3", "Science Fiction", 250),
				new Book("Book D", "Author 4", "Science Fiction", 500),
				new Book("Book E", "Author 5", "Non-Fiction", 100),
				new Book("Book F", "Author 6", "Non-Fiction", 350)
				);

		Map<String, Double> bookMap = getAveragePagesByGenre(bookList);
		for(Map.Entry<String, Double> entry : bookMap.entrySet()){
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}
	public static Map<String, Double> getAveragePagesByGenre(List<Book> books){

		return
				books.stream()
				.filter(b->b.getNoOfPages()>200)
				.collect(Collectors.groupingBy
						(Book::getGenre, Collectors.averagingDouble
								(Book::getNoOfPages)));

	}

}
