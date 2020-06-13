package mustafa;

import java.time.Period;

public class Q37 {

	@SuppressWarnings("static-access")
	static Period period1 = Period.ofWeeks(1).ofDays(3);
	static Period period2 = Period.ofDays(10);
	public static void main(String[] args) {
		System.out.println(period1.getDays());
		System.out.println(period2.getDays());

	}

}
