package mustafa;

import java.util.function.Predicate;

public class Q13 {
	//Predicate<StringBuilder> p1 = () -> {return true;};
	//Predicate<StringBuilder> p2 = (StringBuilder b)  {return true;};
	//Predicate<StringBuilder> p3 = (StringBuilder b) -> return true;
	static Predicate<StringBuilder> p4 = (StringBuilder b) ->  true;
	static Predicate<StringBuilder> p5 = b ->  true;
	static Predicate<Integer> p6 = b ->  b > 5;
	public static void main(String[] args) {

		System.out.println(p5.test(new StringBuilder()));
		System.out.println(p6.test(5));

	}

}
