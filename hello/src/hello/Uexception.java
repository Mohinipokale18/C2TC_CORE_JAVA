package hello;
import java.util.Scanner;
public class Uexception
{
	public static void main(String[] args) //throws cantparticipate// if u want for checked exception 
	{
		int weight;
		System.out.println("Enter your weight");
		Scanner s=new Scanner(System.in);
		weight=s.nextInt(); 
		
		if(weight<50)
		{
			throw new cantparticipate("you can not participate in wrestling");
		}
		else
		{
			System.out.println("you can participate in wrestling");
		}
	}
}
class cantparticipate extends RuntimeException //unchecked exception if u want for checked the write Exception instate RuntimeException 
{
	cantparticipate (String msg)
	{
		super(msg);
	}
}
	




	
