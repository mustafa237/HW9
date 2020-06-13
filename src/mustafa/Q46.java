package mustafa;

public class Q46 {

	public static void main(String[] args) {
		String a = "...m...";
		System.out.println(" " + a);
		
		
		a = a.replace("m", "aMa");
		System.out.println(a);
		
		
		a = a.replace('M', 'm');
		System.out.println(a);
		
		
		a = a.replace(new StringBuilder("ama"),new StringBuilder("M"));
		System.out.println(" " + a);
		
		
		a = a.replace(new StringBuilder(".") + "." + '.',new StringBuilder("a"));
		a = a.replace(new StringBuilder(".") + "." + '.',new StringBuilder("a"));
		System.out.println("   " + a);

	}

}
