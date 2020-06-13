package mustafa;

public class Q39 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String happy = " :) - (: ";
		String really = happy.trim();
		String A = happy.substring(0, happy.length() - 1);
		String B = happy.substring(0, happy.length());
		String C = happy.substring(1, happy.length() - 1);
		String D = happy.substring(1, happy.length());
		System.out.println(A + "\t" + A.equals(happy) + "\n"
								+ B + "\t" + B.equals(happy) + "\n"
										+ C + "\t\t" + C.equals(happy) + "\n"
											    + D + "\t" + D.equals(happy));
		//String question = ; // B is the same
		//System.out.println(really.equals(question));

	}

}
