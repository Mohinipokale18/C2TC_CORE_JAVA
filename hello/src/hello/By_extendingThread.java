package hello;

 class Code extends Thread 
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("MOHINI");
		}
	}
}
class By_extendingThread
{
	public static void main(String[] args) {
		
		Code t=new Code();
		t.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("POKALE"); 
		}
	}
		

	}


//every time output will be change