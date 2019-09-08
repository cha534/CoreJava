package corejava;
//strings:sequences of characters
//syntax:str="hello"
//or String str = new String("hello");
//string objects in class are immutable because it cannot change unless it define other string
//memory wastage for this we use string buffer

public class Strings {

	public static void main(String[] args) {
	String	str ="hello";
	String	str1 ="world";
	int a= 10;
	String str2 = Integer.toString(a);
	System.out.println(str.length());
	System.out.println(str.indexOf(str));
	System.out.println(str.charAt(0));
	System.out.println(str.replace("o", "s"));
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println(str.compareTo(str1));
	System.out.println(str.trim());
	System.out.println(str1.concat(str));
	System.out.println(str2);
		

	}

}
