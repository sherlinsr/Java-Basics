package statement;

public class ifelsestatement {

public static void main (String[]args)
	
	{
	 
	 int a=66;
	 
	 if (a>18 && a<=59)
	 {
	 System.out.println("you are eligible");
	 
	 }
	 else if(a==18)
		
	 {
	 
	 System.out.println("wait for your next birthday");
	 
	 }
	 else if(a>60 && a<=69)
		 
	 {
		 System.out.println("you are not eligible");
	 }
	 
	 else if(a>70 && a<=79)
	 {
		 System.out.println("you con't join this job");
	 }
	 else if (a<18)
	 {
		 System.out.println("you con't apply this job");
	 }
	 else
	  {
		
	   System.out.println("out of job");
	  
	 
	 }
	
   }
}

	
	
	
	

