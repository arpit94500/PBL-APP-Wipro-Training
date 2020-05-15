
public class Main {
	public static void main(String...s)
	{
		Author a = new Author("Arpit Sharma","arpitsharma79854@gmail.com",'M');
		Book b = new Book("Harry Potter",a,2000.95, 10);
		System.out.println(b.getName());
		System.out.println(b.getPrice());
		System.out.println(b.getQtyInStock());
		System.out.println(b.getAuthor().getName());
		System.out.println(b.getAuthor().getEmail());
		System.out.println(b.getAuthor().getGender());
	}
}
