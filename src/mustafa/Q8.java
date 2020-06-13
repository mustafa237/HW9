package mustafa;

import java.util.*;

public class Q8 {

	public static void main(String[] args) {
		List<String> museums = new ArrayList<>(1);
		museums.add("Natural History");
		museums.add("Science");
		museums.add("Art");
		museums.remove(2);
		System.out.println(museums);
		
	}

}
