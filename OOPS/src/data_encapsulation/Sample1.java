package data_encapsulation;

import java.util.Scanner;

/**
 * Simple Java program for OOP Concept
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/


public class Sample1
{
	private double balance=100;
	public void setBalance(double balance)
	{
		this.balance=this.balance+balance;
	}
	public double getBalance()
	{
		return balance;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Sample1 s=new Sample1();
		System.out.println("enter the value:");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		s.setBalance(a);
		System.out.println("Available value:"+s.getBalance());

	}

}
