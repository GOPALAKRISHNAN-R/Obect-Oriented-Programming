package polymorphisms;

/**
 * Simple Java program for OOP Concept
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

class A
{
	void cat()
	{
		System.out.println("Cat");
	}
}
public class MethodOvrRide extends A 
{
	void cat()
	{
		
		System.out.println("cat is pet animal");
	}
	
	public static void main(String[] args) 
	{
		MethodOvrRide m=new MethodOvrRide();
		m.cat();
	}

}
