package corejava;

public class ThisConstructor {
	int a,b;
	double d;
	public ThisConstructor()
	{
		System.out.println("default constructor");
	}
	
	public ThisConstructor(int a,int b,double d)
	{
		System.out.println(a+" "+b+ " " +d);
		System.out.println("nostatic variables before intializing,"  +this.a +this.b +this.d);
this.a=a;
this.b=b;
this.d=d;
System.out.println("non static variables after intialising" +this.a +this.b +this.d);
	}

}

//public static void main(String[] args)
//ThisConstructor t1= new ThisConstructor(10,20,53.4);