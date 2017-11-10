package test;
public class TestThrow1{

	    void validate(int age){
	     if(age<18)
	      throw new ArithmeticException("not valid");
	     else
	      System.out.println("welcome to vote");
	   }
	   
	   public static void main(String args[]){
		   
		   TestThrow1 t1= new TestThrow1();
		   
		   
		   try {
			   t1.validate(10);
		} catch (ArithmeticException e) {
				e.printStackTrace();
		
		}
	     // validate(13);
	      System.out.println("rest of the code...");
	  }
	}