import java.util.*;
public class Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner x=new Scanner (System.in);
		 System.out.println("Enter the string");
		 String A=x.nextLine();
		 char y[]=A.toCharArray();
		 for(int i=0;i<y.length;i++)
		 {
		 if(y[i]>='A' && y[i]<='Z')
		 {
		 y[i]=(char)(y[i]+'a'-'A');
		}
		 else if(y[i]>='a' && y[i]<='z')
		 {
			 y[i]=(char)(y[i]+'A'-'a');
		 }
	}
		 System.out.println("The toggled string are:");
		 for(int i=0;i<y.length;i++)
		 {
		System.out.print(y[i]);
		 }

}
}

	 /*public static void main(String args[])
	 {
	     int c;
	 String str;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the string to be toggled");
	 str=sc.nextLine();
	 char a[]=str.toCharArray();
	     for(c=0;c<a.length;c++)
	     {
	         if(a[c]>='A' && a[c]<='Z')
	         {
	             a[c]=(char)((int)a[c]+32);
	         }
	         else if(a[c]>='a' && a[c]<='z')
	         {
	             a[c]=(char)((int)a[c]-32);
	         }
	     }
	       System.out.println("The toggled string is :-");
	 for(c=0;c<a.length;c++)
	     System.out.print(a[c]);
	 }
	}*/
