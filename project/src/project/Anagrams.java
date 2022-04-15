import java.util.*;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
        System.out.println("Enter the string 1");
        String A=input.nextLine();
        System.out.println("Enter the string 2");
        String B=input.nextLine();
        A=A.replace(" ","");
        B=B.replace(" ","");
        A=A.toLowerCase();
        B=B.toLowerCase();	
		char x[]=A.toCharArray();
		char y[]=B.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		Boolean result=Arrays.equals(x,y);
		if(result==true)
		{
		System.out.println("Its Anagram");
		}
		else 
		{
			System.out.println("Its not an anagram");
		}
			
		
	}

}
