package corejava;

public class SubThisConstructor extends ThisConstructor {
	int a =45;
	public SubThisConstructor(int a,int b,double d)
	{ //default constructor created
		//super();
		System.out.println(a+ "  "+b+ "  " +d);
		System.out.println("before constructor");
		System.out.println(this.a+" "+this.b+" " +this.d);
		this.a=a;
		this.b=b;
		this.d=d;
		System.out.println("after constructor");
		System.out.println(this.a+ " "+this.b+" " +this.d);
	}

	public static void main(String[] args) {
		
		SubThisConstructor ab = new SubThisConstructor(15,25,30.6);

	}

}
