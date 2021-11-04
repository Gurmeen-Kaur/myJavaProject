package TestPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scanner = new Scanner(System.in);
System.out.println("Enter first number i");
int i = scanner.nextInt();

System.out.println("Enter second number n");
int n = scanner.nextInt();

System.out.println("Enter third number k");
int k = scanner.nextInt();

if (i>k && i>n)
		
		{
System.out.println("i is greatest");
	}
else {
	System.out.println("i is not greatest");
} 
if (k>n && k>i)
{
	System.out.println("k is greatest");
}
else 
	{
		System.out.println("k is not greatest");
		
	}
if (n>i && n>k)
	{
		System.out.println("n is greatest");
	}
	else
		{
			System.out.println("n is not greatest");
		}
}
}