package mustafa;

import java.util.*;

public class Q23 {

	public static void main(String[] args) {
		List<Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		chars.set(1, 'c');
		chars.remove(0);
		System.out.print(chars.size()); // Size is the valid method not length

	}

}
