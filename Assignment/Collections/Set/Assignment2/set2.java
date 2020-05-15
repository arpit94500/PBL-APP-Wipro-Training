import java.util.*'
public class set2 {
	public static void main(String[] args) {
		HastSet<String> h = new HashSet<String>();
		h.add("Naman");
		h.add("Mayur");
		h.add("Avinash");
		h.add("AnuDeep");
		
		Iterator it = h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
		