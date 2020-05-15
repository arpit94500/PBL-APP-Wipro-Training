import java.util.*;

public class map5 {

	public static void main(String[] args) {
		Country country = new Country();

		country.saveCountryCapital("India", "Delhi");
		country.saveCountryCapital("China", "Bejing");
		country.saveCountryCapital("England", "London");
		
		System.out.println(country.getCapital("India"));
		System.out.println(country.getCountry("Tokyo"));
		System.out.println(country.toArrayList());
		
		HashMap<String, String> M2 = country.swapKyeValue();
		System.out.println(M2);
	}
	}

}