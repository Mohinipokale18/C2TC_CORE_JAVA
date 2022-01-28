package hello;

class A
{
	void one()
	{
		System.out.println("This");
	}
}
class B extends A
{
	void two()
	{
	System.out.println("IS");
	}
}
class C extends B
{
	void three()
	{
	System.out.println("Multilevel Inheritance");
	}
}

 class multilevelinheritance {
public static void main(String args[])
 {
	C d=new C();
	d.one();
	d.two();
	d.three();
	
 }

}
