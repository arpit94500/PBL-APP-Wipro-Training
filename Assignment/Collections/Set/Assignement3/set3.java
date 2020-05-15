import java.util.*;
public class set3 {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>();
		Collection<String> t = new TreeSet<>(Collections.reverseOrder());
		t.add("Wasim");
		t.add("Dravid");
		t.add("Bhumra");
		t.add("Rishabh");

		Iterator<String> it = t.iterator();
		String query = "Dravid";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}