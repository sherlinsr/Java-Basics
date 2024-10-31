package loops;

import java.util.Scanner;

public class atm {

	
	public static void main (String[]args) 
	{
	 int correctPin=2345;
	 int Amount=10000;
	
	
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your pin");
	 int pin =sc.nextInt();
	 
	 if(correctPin==pin) 
	 {
	  	System.out.println("your pin is correct");
	    System.out.println("1.withdraw 2.credit 3.pin change 4.balance");
	  	int a=sc.nextInt();
	  	    	if(a==1)
	  	    		System.out.println("Enter your amount");
	  	    		int amount=sc.nextInt();
	  	    		if(amount>=0 && amount<=10000)
	  	    			Amount=(Amount-amount);
				     {
					 System.out.println("congragulation"); 
				     }
	                 {
	            	  System.out.println("your account balance is"+Amount);
	                 }
	                System.out.println("1.withdraw 2.credit 3.pin change 4.balance");
	     	  	    int d=sc.nextInt();   
	             if(a==2)
	            	System.out.println(" how much amount you want to credit");
	         	 	int am=sc.nextInt();
	         	 	Amount=(Amount+amount);
	         	 	System.out.println("you have credited"+amount);
	         	 	{
	         	 	System.out.println("error");
	         	 	}
	       }
     else
			  {
				  System.out.println("error");
		
			  }
	 }
	}

	 
	

