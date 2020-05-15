
public class Book {



	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	public Book(String name, Author author, double price, int qtyInStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	Author getAuthor() {
		return author;
	}
	void setAuthor(Author author) {
		this.author = author;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	int getQtyInStock() {
		return qtyInStock;
	}
	void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	


}
