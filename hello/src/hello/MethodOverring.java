package hello;

class MethodOverring{  
			   
			  void run()
			  {
				  System.out.println("Vehicle is running");
			 }  
			}  
			  
			class Bike2 extends MethodOverring{  
				
				
			  //defining the same method as in the parent class  
			  void run()
			  {
				  System.out.println("Bike is running safely");
			 }  
			  
			  public static void main(String args[]){  
			  Bike2 obj = new Bike2(); 
			  obj.run(); 
			  }  
			}  

	


