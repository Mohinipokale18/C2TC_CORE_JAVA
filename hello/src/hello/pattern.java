package hello;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) 
	{
		  int num; 
          Scanner s=new Scanner(System.in); 
          System.out.println("Enter A Number"); 
          num =s.nextInt(); 	
	
		// TODO Auto-generated method stub
		for(int i=0; i<num; i++)   
		{   
		for(int j=0; j<=i; j++)   
		{   
		System.out.print("* ");   
		}   
		System.out.println(); 
		}
	}

}
