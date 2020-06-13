package mustafa;

import java.util.*;
@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
public class Q12 {
	
	public static void secret2(ArrayList mystery) {
		mystery.add("metal");
		//String str = mystery.get(0);
		//int num = mystery.length();
	}
	
	public static void secret(ArrayList<String> mystery) {
		mystery.add("metal");
		String str = mystery.get(0);
		//int num = mystery.length(); //method is not available for this class.
	}
	public static void secret(StringBuilder mystery) {
		//mystery.add("metal");
		//String str = mystery.get(0);
		int num = mystery.length();
	}
	public static void main(String[] args) {
		}
}
