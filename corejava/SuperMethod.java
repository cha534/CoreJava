package corejava;

public class SuperMethod extends SuperMethods {
	public void display()
	{
		System.out.println("non static2");
	}
public static void show()
{
	System.out.println("static method2");
}
public void apple()
{
	System.out.println("non static");
	display();
	show();
	super.display();
	super.show();
}
	public static void main(String[] args) {
		SuperMethod a = new SuperMethod();
		a.apple();

	}

}
