package corejava;
//constructor:class name should be same as constructor name
//constructor doesnot have return type
//constructor call at the time of object creation
//constructor provide outside of method/block
//if any java program doesn't have constructor compiler provides default constructor
//two types of constructor:default and parameterized constructor

public class Constructor {

	public Constructor()
	{
		System.out.println("default constructor");
	}
	public Constructor(int x,int y)
	{
		System.out.println("param constructor");
	}
	public static void main(String[] args) {
		Constructor a = new Constructor();
		Constructor b = new Constructor(10,200);
	

	}

}
