package inheritance;

/**
 * Simple Java program for OOP Concept
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class A
{
	protected int a=22,b=44,c;
	public void add()
	{
		c=a+b;
		System.out.println(c);
	}
	
	
}
class B extends A
{
	void sub()
	{	
		add();
		c=a-b;
		System.out.println(c);
	}
	
}
public class SingleInhe
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.sub();

	}

}
