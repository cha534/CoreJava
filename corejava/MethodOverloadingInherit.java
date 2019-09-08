package corejava;

public class MethodOverloadingInherit  extends MethodOverloading{
	public void show(long l)
	{
		System.out.println(l);
	}
	public void show(String s,int c)
	{
		System.out.println(s+ " "+c);
	}
	public static void main(String[] args) {
		
		MethodOverloadingInherit  j=new MethodOverloadingInherit ();
		j.show(10);
		j.show("acde", 40);
		
	}

}
