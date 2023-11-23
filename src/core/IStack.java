package core;

public interface IStack {
	int getSize() ;
	boolean isEmpty() ;
	boolean isFull();
	void push(Object elm);
	Object top();
	Object pop();
}
