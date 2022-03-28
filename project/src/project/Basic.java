package project;

public class Basic {

	public static void main(String[] args)
	{
		int year=1786;
		if (year%4==0 && year%100!=0 || year%400==0)
		{
				System.out.println("Yes");
		}
			else
			{
				System.out.println("No");
			}
	}
}


