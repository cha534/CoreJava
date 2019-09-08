package corejava;

public class SuperKeywordExtends extends SuperKeyword {
int a=10;
public void add()
{
	System.out.println(a);
	System.out.println(super.a);
	System.out.println(super.b);
}
	public static void main(String[] args) {
		SuperKeywordExtends obj = new SuperKeywordExtends();
		obj.add();

	}

}
