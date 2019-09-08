package corejava;

public class Test1 implements Interface1,Interface2 {

	@Override
	public void abs() {
		System.out.println("abs method");
		
	}

	@Override
	public void abs1() {
	System.out.println("abs1 method");
		
	}

	@Override
	public void display() {
		System.out.println("display method");
		
	}

	@Override
	public void show() {
		System.out.println("show method");
		
	}
	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.abs();
		obj.abs1();
		obj.display();
		obj.m1();
		obj.m3();
		Interface1.m2();
Interface2.m4();
}

}
