package corejava;
//Operators:symbol used to perfrom operations
//operations perform from right hand side to left hand side
//there are 8 types of operators in java
//uniary:postfix,prefix(++a,a--,a++,--a)
//arthimatic:arthimatic operations like +,-,*,/,%
//shift:shift operations >>,<<,<<<,>>>
//relational:comparsion,equality <,><=,>=,==,!=
//bitwise:bitwise AND,OR &,^,&&
//logical:AND,OR &&,||
//ternary:?:
//assignment:=+,=-,=*

public class Operators {

	public static void main(String[] args) {
		int a = 10;
		int b= 20;
		int c=40;
		int sum = a+b;
		int total = a+b*c;
		int d=20;
		System.out.println("sum of two numbers "+sum);
		System.out.println("total of three numbers "+total);
		System.out.println("preceding "+(++d));
		

	}

}
