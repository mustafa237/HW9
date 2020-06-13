package Mustafa;

public Q3{
  public static void main(String[] args) {
  StringBuilder a = new StringBuilder().append("clown" );
  StringBuilder b = new StringBuilder ("clown");
  StringBuilder c = new StringBuilder("cl").insert(2, "own");
  System.out.println(a.toString());
  System.out.println(b.toString());
  System.out.println(c);
  }
  
  D
  //'new Stringbuilder()' is “”, like an empty string, appending “clown” results “clown”. new Stringbuilder(“clown”) is directly “clown”. new Stringbuilder(“cl”) and .insert(2,“own”) inserts “own” to “cl” starting from index 2 which again results “clown”
  
}
