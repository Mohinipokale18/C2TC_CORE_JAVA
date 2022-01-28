package hello;

class bird
{  
void fly()
{
	System.out.println("most of the birds can fly.");}  
}  
class penguin extends bird
{  
void unable()
    {
	System.out.println("penguin can not fly");
	}  
}  
class singleinheritance{  
public static void main(String args[])
{  
penguin d=new penguin();  
d.unable();  
d.fly();  
}
} 


