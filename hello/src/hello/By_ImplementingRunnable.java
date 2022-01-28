package hello;

class Z implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("create thread By Implementing Runnable ");
		}
	}
}

class By_ImplementingRunnable {

	public static void main(String[] args) {
		Z r=new Z();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread  ");
		}

	}

}
