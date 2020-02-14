package JavaProject;

import java.util.Scanner;
class JavaProject
{
   public static void main(String args[])
   {		
	int temp;
	boolean isPrime=false;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
	//capture the input in an integer
	int num=scan.nextInt();
        scan.close();
	for(int i=2;i<=num/3;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=true;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}