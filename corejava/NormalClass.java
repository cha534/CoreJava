package corejava;

public class NormalClass extends abst{
	@Override
	public void display() {
		System.out.println("display method ");
		
	}

	@Override
	public void abs2() {
		System.out.println("abs2 method");
		
	}
	
	public static void main(String[] args) {
		
		NormalClass obj = new NormalClass();
		obj.abs();
		obj.abs2();
		obj.display();
		obj.m1();
		Inter1.m2();

	}

	

	

}
