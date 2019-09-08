package corejava;

public  class AbstractExample2 extends AbstractionExample1 {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("method display");
		
	}

	@Override
	public void show() {
		System.out.println("method show");
	}
		public static void main(String[] args) 
		{
			AbstractExample2 obj = new AbstractExample2();
			obj.display();
			obj.show();
			obj.m1();

		}

		
		
	}

