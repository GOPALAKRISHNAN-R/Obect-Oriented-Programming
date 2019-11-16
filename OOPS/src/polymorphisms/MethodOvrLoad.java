package polymorphisms;

/**
 * Simple Java program for OOP Concept
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class MethodOvrLoad 
{
	public void add()
	{
		System.out.println("Method without parameter");
	}
	public int add(int a)
	{
		return a;
	}
	public int add(int a,int b)
	{
		int c;
		c=a+b;
		return c;		
	
	}
	
	public static void main(String[] args) 
	{
		MethodOvrLoad a=new MethodOvrLoad();
		a.add();
		System.out.println("Method with 1 parameter:"+a.add(2));
		System.out.println("Method with 2 parameter:"+a.add(5,6));
	}

}
