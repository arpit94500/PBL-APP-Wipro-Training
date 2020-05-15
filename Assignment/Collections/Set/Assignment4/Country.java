import java.util.*;

public class Country {
	//HastSet<String> H1 = new HashSet<String>();
	
	TreeSet<String> H1 = new TreeSet<String>();
	
	public TreeSet<string> saveCountryName(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while(it.hasNext()) {
			if(it.next().equals(CountryName))
				return CountryName;
		}
		return null;
	}
}
