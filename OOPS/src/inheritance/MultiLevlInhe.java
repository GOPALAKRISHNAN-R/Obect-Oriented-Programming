package inheritance;

/**
 * Simple Java program for OOP Concept
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
class A1
{
	protected int a=20,b=4,c;
	public void add()
	{
		c=a+b;
		System.out.println("Addition value:"+c);
	}
	
	
}
class B1 extends A1
{
	void sub()
	{	
		c=a-b;
		System.out.println("Subtraction value:"+c);
	}
	
}
class C extends B1
{
	void div()
	{
		c=a/b;
		System.out.println("Division value:"+c);
	}
	void display()
	{
		add();
		sub();
		div();
	}
	
}


public class MultiLevlInhe 
{
	public static void main(String[] args) 
	{

		C ob=new C();
		ob.display();
	}

}
