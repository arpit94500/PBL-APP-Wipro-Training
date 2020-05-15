import java.util.ArrayList;
import java.util.List;

class MyArrayList<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}

public class list4 {

	public static void main(String[] args) {
		List<Object> list = new MyArrayList<>();
		
		try {
			list.add(12);
			list.add(3.4);
			list.add(4.65455);
			list.add("String");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(list);

	}

}