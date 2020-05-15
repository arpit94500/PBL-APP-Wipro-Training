import java.util.*;

public class Country {
	HastSet<String> H1 = new HashSet<String>();
	
	public HashSet<string> saveCountryName(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	public String getCountry(String CountryName) {
		Iterator it = H1.iterator();
		
		while(it.hasNext()) {
			if(it.next().equals(CountryName))
				return CountryName;
		}
		return null;
	}
}
