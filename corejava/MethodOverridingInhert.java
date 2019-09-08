package corejava;

public class MethodOverridingInhert extends MethodOverriding {
	public void show(double d,int f)
	{
		System.out.println("show2");
	}
	public void display(int a, int b)
	{
		System.out.println("display2");
	}

	public static void main(String[] args) {
		MethodOverridingInhert m1=new MethodOverridingInhert();
		m1.show(0, 20);
		m1.display(56, 80);
		System.out.println(" uuuuuuuuuuuu");
		m1.show(29);
		m1.display(122, 39);

	}

}
