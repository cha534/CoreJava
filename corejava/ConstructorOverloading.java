package corejava;
//constructor overloading:same constructor name different parameters
//can we possible to overload a constructor? YES
//can we possible to override a constructor? NO
public class ConstructorOverloading {

	public ConstructorOverloading()
	{
		System.out.println("default");
	}
	public ConstructorOverloading(int x,int y)
	{
		System.out.println(x+ " "+y);
	}
	public ConstructorOverloading(String s, int a)
	{
		System.out.println(s+" " +a);
	}
	public static void main(String[] args) {
	
		ConstructorOverloading a1 = new ConstructorOverloading();
		ConstructorOverloading b = new ConstructorOverloading(10,200);
		ConstructorOverloading c = new ConstructorOverloading("abcd",10);
	}

}
