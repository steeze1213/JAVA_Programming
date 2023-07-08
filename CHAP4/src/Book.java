public class Book {
	String title;
	String author;
	
	public Book(String t) {
		title = t;
		author = "Unknown Author";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public static void main(String [] args) {
		Book littlePrince = new Book("The little Prince", "Saint-Exupery");
		Book loveStory = new Book("Chunhyangjeon Hall");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}