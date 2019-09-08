package corejava;
//non static method :it can call in non static method directly in static it need to create object
//non static method a variable is non static it can use directly with in class outside class object creation is mandatory
//non static variable in out side nonstatic method can use by object creation
public class NonStaticMethod {
	int f=40;
	static int g=50;
	public void subtract()
	{
		System.out.println(f);
		System.out.println(g);
	}
	public static void multiply()
	{
		System.out.println(g);
		NonStaticMethod b = new NonStaticMethod();
	System.out.println(b.f);
	}

	public static void main(String[] args) {
		NonStaticMethod c = new NonStaticMethod();
		c.subtract();
		multiply();
		
		

	}

}
