package mustafa;
import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
		List<Character> chars = new ArrayList<>();
    chars.add('a');
    chars.add('b');
    chars.set(1, 'c');
    chars.remove(0);
    System.out.print(chars.size() + " " + chars.contains('b'));
	  
  }
  
  A
	// Char 'b' was replaced by code chars.set(1, 'c'); before  and char 'a' was removed by chars.remove(0);
  
}
