package corejava;
//Polymorphism:poly means many 
//morphism is behaviuor/forms
//there two types of polymorphism
//compile time/method overloading:same method different parameters
public class MethodOverloading {
public void show(long l)
{
	System.out.println(l);
}
public void show(int a,float b)
{
	System.out.println(a+ " "+b);
}
public void show(String s,int c)
{
	System.out.println(s+ " "+c);
}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.show(100);
		m.show(10, 20);
		m.show("abc", 70);


	}

}
