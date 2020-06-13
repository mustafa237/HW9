package mustafa;

import java.util.function.Predicate;

public class Q34 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Predicate clear = c -> c.equals("clear");
		System.out.println(clear.test("pink"));

	}

}
