package project;
import java.util.Scanner;
public class Student 
{
public static void main(String[] args)
{
	System.out.println("Enter the size of array");
	Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int columns=sc.nextInt();
    int arr[][]= new int[rows][columns];
    System.out.println("Enter the array elements");
    for (int i=0;i<rows;i++)
    { 
    	for (int j=0;j<columns;j++)
            arr[i][j]=sc.nextInt();
    }
    System.out.println("The transpose array elements");
   for (int j=0;j<columns;j++)//j=1
    {
        for (int i=0;i<rows;i++)//i=0
        {
        	if(i==0)
            System.out.print(arr[i][j]);
        	else
        		System.out.print(" "+arr[i][j]);
}
        System.out.println();
    }
}
}

