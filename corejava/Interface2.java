package corejava;

public interface Interface2 {
	public void abs();
	public void abs1();
	public default void m3()
	{
		System.out.println("default i2");
	}
	public static void m4()
	{
		System.out.println("static method");
	}

}
