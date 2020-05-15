import java.util.*;

public class map3 {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		properties.setProperty("Tamil Nadu", "Chennai");
		properties.setProperty("Telengana", "Hyderabad");
		properties.setProperty("Maharastra", "Mumbai");

		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<Object, Object> e = it.next();
			System.out.println(e);
		}
	}

}