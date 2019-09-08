package corejava;

public abstract class Abstractclass {
	int a =20;
	static int f=89;
	public abstract void display();
	public abstract void show();
	public void m1()
	{
		System.out.println("non static method");
	}
	public Abstractclass()
	{
		System.out.println("constructor");
	}
public static void m2()
{
	System.out.println("static method");
}
	public static void main(String[] args) {
		System.out.println(f);
		
		m2();
		
		//Abstractclass obj = new Abstractclass();//by using abstract class name we cannot create object
		}

}
