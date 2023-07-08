public class Book2 {
	String title;
	String author;

	void show() { System.out.println(title + " " + author); }
	
	public Book2() {
		this("", "");
		System.out.println("Constructor Called");
	}

	public Book2(String title) {
		this(title, "Unknown Author");
	}
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String [] args) {
		Book2 littlePrince = new Book2("The little Prince", "Saint-Exupery");
		Book2 loveStory = new Book2("Chunhyangjeon Hall");
		Book2 emptyBook = new Book2();		
		loveStory.show();
	}
}