package mustafa;


public class Q24 {
	public static void secret(String mystery) {
		mystery = mystery.replace("1", "8");
		mystery.startsWith("paper");
		String s = mystery.toString();
		System.out.print(s);
		}

	public static void main(String[] args) {
		secret("Test1");

	}

}
