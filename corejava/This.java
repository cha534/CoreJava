package corejava;
//This:using this keyword identify the current class object properties
//this keyword operations perform in non static metthod/block not in static
public class This {
	int a,b;
	static int c,d;
public void display(int x, int y)
{
	System.out.println(x+ "  " +y);
	System.out.println(this.a);
	System.out.println(this.c);
	
	
}
	public static void main(String[] args) {
	This e = new This();
	e.a=40;
	e.c=20;
	e.display(10, 20);

	}

}
