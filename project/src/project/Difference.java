package project;
import java.util.*;
public class Difference {

	public static void main(String[] args) {
		int res1=0,res2=0;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the value of n");
	    int n= a.nextInt();
	    System.out.println("Enter the value of m");
	    int m=a.nextInt();
	
	    for(int i=1;i<=m;i++)
	    {
	    	if(i%n==0)
	    	{
	    		res1=res1 +i;
	    	}
	    	else
	    	{
	    		res2=res2+i;
	    	}
	    }
	    int res = Math.abs(res2-res1);
	System.out.println(" The output is " +res ); 
   
	}

}
