package operator;

public class logicaloperator
{

	public static void main(String[]args)
	{
	
	int a=5;
	int b=7;
	int x=9;
	int y=10;
	
	boolean c= a>b && x<y ;
	
	System.out.println(c);
	
	int d=9;
	int e=3;
	int f=3;
	int g=5;
	
	boolean h=d>e || f<g;
	
	System.out.println(h);
	
	int i=7;
	int j=9;
	int k=5;
	int l=8;
	
	boolean m=i>j && k<l;
	
	System.out.println(!m);   //!
	
	
	
	
	
}
}