public class map2 {
	public static void main(String[] args) {
		Map<String,Stering> M1 = new HashMap<String,String>();
		
		M1.put("India","Delhi");
		M1.put("Pakistan","IStanbul");
		M1.put("USA","Washington");
		
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			if (me.getKey().equals("Japan")) {
				System.out.println("Key Japan exists");
				break;
			}
		}
		
		
		set = map.entrySet();
		it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals("Delhi")) {
				System.out.println("Value Delhi exists");
				break;
			}
		}
		
		
		set = map.entrySet();
		it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me);
			System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());
		}
		
		
	}
}
		