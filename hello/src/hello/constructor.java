package hello;

public class constructor {
	String name;
	int roll,age;

	public constructor(String name, int roll,int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.roll=roll;
		this.age=age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor s1=new constructor("mohini",50,21);
		constructor s2=new constructor("vina",51,24);
		
		
		System.out.println(s1.name+" "+s1.roll+" "+s1.age);
		System.out.println(s2.name+" "+s2.roll+" "+s2.age);
	}

}
