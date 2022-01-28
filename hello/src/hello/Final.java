package hello;

public class Final
{
  
	  final void run()
	  {
		  System.out.println("running");
		 }  
	}  
	     
	class Honda extends Final
	{  
	   void run()
	   {System.out.println("running safely with 100kmph");
	   }  
	
	   public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run();  
	   }  
	}  
		
// it gives error bcz you make any method as final, you cannot override it

