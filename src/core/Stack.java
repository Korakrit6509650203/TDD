package core;

public class Stack implements IStack {
	Object element ;
	Object arr[];
	int capacity = 3;
	int top ;
	Stack(){
		arr = new Object[capacity];
		top = -1 ;
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isFull() {
		if(top<capacity-1) {
			return false;
		}
		
		else {
			return true;
		}
	}
	public void push(Object elm) {
		if(!isFull()) {
			++top;
			arr[top] = elm;
		}
	}
	public Object top() {
		return arr[top];
	}
	public Object pop() {
		Object x = arr[top];
		arr[top] = null;
		top--;
		return x;
	}
}

