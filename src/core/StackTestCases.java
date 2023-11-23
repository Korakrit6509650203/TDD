package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {

	//TC1
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		assertEquals(true,s1.isEmpty());
		
		assertEquals(0,s1.getSize());
	}
	
	//TC2
	public void testPushElmToNonFullStackAndToTop() {
		//create new stack 
		Stack s2 = new Stack();
		Integer obj1 = new Integer(1);
		//check whether the stack is full
		boolean isFullStack = s2.isFull();
		
		//if not full then push an element to the stack
		if(!isFullStack) {
			s2.push(obj1);
			
		//get top element of the stack
			Object o = s2.top();
		
		//assert that top element is equal to the pushed element
			assertEquals(1, o);
		}
	}
	
	//TC3
	public void testSameObjectOnTop() {
		Stack s3 = new Stack();
		Integer obj1 = new Integer(1);
		Integer obj2 = new Integer(2);
		String obj3 = new String("Hello CS264");
		try {
			s3.push(obj1);
			s3.push(obj2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		assertEquals(obj1.getClass(), s3.top().getClass());
		assertEquals(obj2.getClass(), s3.top().getClass());
		
		try {
			s3.push(obj3);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//TC4
	public void testLastInFirstOut() {
		Stack s4 = new Stack();
		Integer obj1 = new Integer(1);
		Integer obj2 = new Integer(2);
		try {	
			s4.push(obj1);
			s4.push(obj2);
		}catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(2, s4.pop());
		assertEquals(1, s4.pop());
	}
}
	
	//TC5
//	public void testStackLimit() {
//		Stack s5 = new Stack();
////		assertEquals(1, s5.getSize());
////		assertEquals(1, s2.getSize());
//		try {
//			s5.push(1);
////			s5.push(2);
////			s5.push(3);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
////		assertEquals(true, s5.isFull());
//		assertEquals(0, s5.top);
//		
//		try {
//			s5.push(4);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		assertEquals(2, s5.top);
//	}
//}
