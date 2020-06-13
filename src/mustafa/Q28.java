package mustafa;

import java.util.function.Predicate;

public class Q28 {

	public static void main(String[] args) {
		Predicate<String> dash = c -> c.startsWith(" "); // Diamond operator added.
		System.out.println(dash.test("–"));

	}

}
