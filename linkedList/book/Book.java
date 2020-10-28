package book;

public class Book {
	private String title;
	private String publisher;
	private double price;
	private int yearPublished;

	public Book(String t, String p, double price, int y) {
		this.title = title;
		this.publisher = p;
		this.price = price;
		this.yearPublished = y;
	}
	
	public String getTitle() {
		return this.title;
	}

	public String getPublished() {
		return this.publisher;
	}

	public double getPrice() {
		return this.price;
	}

	public int getYearPublished() {
		return this.yearPublished;
	}

	public void setTitle(String t)) {
		this.title = t;
	}

	public void setPublished(String p) {
		this.publisher = p;
	}

	public void setPrice(double p) {
		this.price = p;
	}

	public void setYearPublished(int yp) {
		this.yearPublished = yp;
	}
}