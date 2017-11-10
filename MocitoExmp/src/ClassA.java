
public class ClassA {
	
	ClassB b = null;	

	public int  add() {
		//b = new ClassB();
		System.out.println(b.hashCode());
		int a= b.getno();
		
		int c=a*a;
		
		return c;
		
	}
	
	
}
