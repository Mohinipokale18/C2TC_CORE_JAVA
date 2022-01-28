package hello;

class Aa
{
	void one()
	{
		System.out.println("This");
	}
}
class Bb extends Aa
{
	void two()
	{
	System.out.println("IS");
	}
}
class Cc extends Aa
{
	void three()
	{
	System.out.println("Hierarchical");
	}
}
class D extends Aa
{
	void four()
	{
	System.out.println("Inheritance");
	}
}

 class Hierarchicalinheritance {
public static void main(String args[])
 {  
	Bb obj_b =new Bb();
	obj_b.one();
	obj_b.two();
	
	
	Cc obj_c=new Cc();
	obj_c.one();
	obj_c.three();
	
	D obj_d=new D();
	obj_d.one();
	obj_d.four();
	
	
	
 }

}





