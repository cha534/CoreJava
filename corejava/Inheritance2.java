package corejava;

public class Inheritance2 extends Inheritance {
public void display()
{
	System.out.println(a);
	System.out.println(b);
}
public static void display2()
{
	Inheritance2 c = new Inheritance2();
	System.out.println(c.a);
	System.out.println(b);
}
	public static void main(String[] args) {
		Inheritance2 d = new Inheritance2();
		d.display();
		display2();
		

	}

}
