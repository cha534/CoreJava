package corejava;
//Interface:100%abstraction
//support multiple inheritance
//in jdk 1.7 only abstract methods are possible to  declare not any body methods
//in jdk1.8 abstractmethods,default concret methods,static methods can declare

public interface Interface {
	public void display();//abstract method
	public default void show()
	{
	System.out.println("concret nethod");//concret method	
	}
public static void m1()
{
System.out.println("static method");//static method	
}
	public static void main(String[] args) {
		

	}

}
