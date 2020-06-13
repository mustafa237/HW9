package mustafa;



public class Q17 {// as Shoot class
	interface Target {
		boolean needToAim(double angle);
	}
	static void prepare(double angle, Target t) {
		boolean ready = t.needToAim(angle); // k1
		System.out.println(ready);
	}

	public static void main(String[] args) {
		prepare(45, d -> d > 5 || d < -5);
		prepare(0, d -> d > 5 || d < -5); // k2
	}

}
