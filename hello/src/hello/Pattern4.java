package hello;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int num; 
          Scanner s=new Scanner(System.in); 
          System.out.println("Enter A Number"); 
          num =s.nextInt(); 	
	
		// TODO Auto-generated method stub
		for(int i=1; i<=num; i++)   
		{   
		for(int j=1; j<=i; j++)   
		{   
		System.out.print(j);   
		}   
		System.out.println(); 
		}
	}

}
	


