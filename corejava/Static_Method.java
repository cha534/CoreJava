package corejava;
//static method:a method or variable which is static can be accessed directly in non static method
//static method with in class call directly outside class call class name.method
//
public class Static_Method {
	int b=30;
	static byte c=50;
	public static void apple()
	{
		System.out.println(c);
		Static_Method d = new Static_Method();
		System.out.println(d.b);
		
	}
	public void add()
	{
		System.out.println(b);
		System.out.println(c);
		apple();
	}

	public static void main(String[] args) {
		apple();

	}

}
