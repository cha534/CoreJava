package corejava;

public interface Interface1 {
	public  void display();
	public void show();
	public default void m1()
	{
		System.out.println("default method");
	}
	public static void m2()
	{
		System.out.println("static method");
	}

	

}
