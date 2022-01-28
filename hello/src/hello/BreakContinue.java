package hello;

public class BreakContinue {


		
		// TODO Auto-generated constructor stub
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 System.out.println(" break statement");
		for (int i = 0; i < 10; i++)
		{
			  if (i == 4)
			  {
			    break;
			  }
			  System.out.println(i);
			}
		 System.out.println("\n");
		 System.out.println(" continue statement");
		 
		for (int i = 0; i < 10; i++)
		{
			  if (i == 4)
			  {
				  continue;
			  }
			  System.out.println(i);
			}
	}

}


