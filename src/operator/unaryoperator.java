package operator;

public class unaryoperator {                                      // it is also called increment or decrement operators

	public static void main(String[] args)
	{
		
	     //one variable
		
		//  a=12
		// a++
		// ++a
			
		   //example 1
			
			int a =15;
		
			int c=a++ + a++;
			 
			System.out.println(c);
			
			//example 2
			
			int b=18;
			
			int d=++b + ++b;
			
		    System.out.println(d);
					
		    //example 3
		    
		    int e=13;
		    
		    int f=e++ + ++e;
		    
		    System.out.println(f);
		    
		    //example 4
		    
		    int g=27;
		    
		    int h=++g + g++;
		    		
		    System.out.println(h);		
		    		
		    //two variables
		    
		    int i=10,j=20;
		    
		    int k=i++ + j++;
		    
		    System.out.println(k);
		    
		    int l=56,m=33;
		    
		    int n=++m + l++;
		    
		    System.out.println(n);
		    
		    //several examples a=39,b=67  c=++a + ++b; c=?    a=40,b=70 c=a++ +++b;  c=?
		    
		    int p=10,q=20,r=30;
		    
		    int s=++p + ++q + ++r;
		    
		    System.out.println(s);
		    
		    int t=12,u=14,v=16;
		    
		    int w=++t + t++ + ++u + u++ + ++v + v++;
		    
		    System.out.println(w);
		    
		    //example a=17,b=12,c=11  d=++a + ++B + ++C + a++ + b++ + c++;  d=? 
		    
		    //example a=10;  b=--a + a--;  b=?   a=33; b=a-- + a--;  b=?
		    
		    
		   
		    
		}
	
}
