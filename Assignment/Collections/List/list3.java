import java.util.*;
import java.io.*;
public class list3 {
	
	public static void printAll(ArrayList arr) {
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Namita");
		arr.add("Sumati");
		
		printAll(arr);
	}
}
