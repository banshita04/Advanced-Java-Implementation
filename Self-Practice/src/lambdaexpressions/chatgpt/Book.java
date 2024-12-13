package lambdaexpressions.chatgpt;

public class Book {
	private String title;
	private String author;
	private String genre;
	private int noOfPages;
	public Book(String title, String author, String genre, int noOfPages) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.noOfPages = noOfPages;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	
}
