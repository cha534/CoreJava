package corejava;

public class SuperConstructors extends SuperConstructor {
	
	public SuperConstructors()
	{
		super();
		System.out.println("xxxxxxx");
	}
	public SuperConstructors(int x, int y)
	{
		System.out.println("yyyyyyyyyy");
	}

	public static void main(String[] args) {
		SuperConstructors b =new SuperConstructors();

	}

}
