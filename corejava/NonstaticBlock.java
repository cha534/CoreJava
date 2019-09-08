package corejava;
//Non static block excutes at object creation
public class NonstaticBlock {
static 
{
	System.out.println("static block");
}
{
	System.out.println("nonstaticblock");
}


	public static void main(String[] args) {
		
System.out.println("main method");
NonstaticBlock b= new NonstaticBlock();
	}

}
