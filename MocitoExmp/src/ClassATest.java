import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ClassATest {

	@Mock
	ClassB b;
	
	
	@InjectMocks
	ClassA a;
	
	@Test
	public void testAdd() {
		//ClassB b1=null;
	//	System.out.println(b1.hashCode());
System.out.println(b.hashCode());		
		
		when(b.getno()).thenReturn(5);
		assertEquals(25,a.add());
		
		
	}

}
