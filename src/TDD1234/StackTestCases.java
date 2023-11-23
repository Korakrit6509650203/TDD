package TDD1234;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {

	//TC1
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		assertEquals(true,s1.isEmpty());
		
		assertEquals(0,s1.getSize());
	}
	
	//TC2
	public void testPushElmToTop() {
		//create new stack 
		Stack s = new Stack();
		Integer obj1 = new Integer(1);
		//check whether the stack is full
		boolean isFullStack = s.isFull();
		
		//if not full then push an element to the stack
		if(!isFullStack) {
			s.push(obj1);
			
		
		//get top element of the stack
			s.top();
		
		//assert that top element is equal to the pushed element
			assertEquals(s.top(), obj1);
		}
	}
	
	//TC3
	public void testLastInFirstOut() {
		Stack s = new Stack();
		Integer obj1 = new Integer(1);
		Integer obj2 = new Integer(2);
		try {	
			s.push(obj1);
			s.push(obj2);
		}catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(s.pop(), obj2);
		assertEquals(s.pop(), obj1);
	}
}

