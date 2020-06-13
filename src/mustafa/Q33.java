package mustafa;

public class Q33 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("red");
		System.out.println(sb.charAt(1));
		sb.deleteCharAt(0);
		sb.delete(1, 2);
		System.out.println(sb);

	}

}
