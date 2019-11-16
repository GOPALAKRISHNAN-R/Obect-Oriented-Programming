package inheritance;

/**
 * Simple Java program for OOP Concept
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
class Dean
{
	void display()
	{
		
	System.out.println("Hi,I'm Deam of Science Faculty");
	}
}
class Msc extends Dean
{

	void display11()
	{
		System.out.println("Good morning sir..");
	}

}
class Mca extends Dean
{

	void display12()
	{
		System.out.println("Good Evening sir..");
	}

}
class Bio extends Dean
{
	void display1()
	{
		display();
		System.out.println("Good night sir..");
	}
	
}
public class HierInheritance 
{
	public static void main(String[] args) 
	{
	Bio ob=new Bio();
	ob.display1();
	

	}

}
