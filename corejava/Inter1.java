package corejava;

public interface Inter1 {
	public void display();
	public default void m1()
	{
		System.out.println("default method");
	}
	public static void m2()
	{
		System.out.println("static method");
	}
	

}
