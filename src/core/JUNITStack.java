package core;

//6509611940
import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
		
	}
	public void testPushElmToTop() {
		Stack s2 = new Stack();
		assertFalse(s2.isFull());
		
		s2.push(1);
		assertEquals(1, s2.top());
	}
	public void testLastInFirstOut() {
		Stack s3 = new Stack();
		assertFalse(s3.isFull());
		for(int i=1;i<=5;i++) {
			s3.push(i);
		}
		assertEquals(s3.top(), s3.pop());
		assertEquals(4, s3.pop());
		assertEquals(3, s3.getSize());
	}
	
	public void PushElmToLimitedSizeStack() {
		Stack s4 = new Stack();
		assertFalse(s4.isFull());
		for(int i=1;i<=5;i++) {
			s4.push(i);
		}
		assertTrue(s4.isEmpty());
		s4.push(6);
		assertTrue(s4.isFull());
	}
	
}
