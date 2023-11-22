package core;

//6509611940
public class Stack implements IStack {
	int values;
	int top=-1;
	Object[] stack = new Object[5];
	int size=0;
	public Stack() {
	}

	@Override
	public boolean isEmpty() {
		if(isFull()) {
			return false;
		}
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public Object top() {
		if(isEmpty()) {
			return stack[top];
		}
		return 0;
	}

	@Override
	public void push(Object elm) {
		stack[++top] = elm;
		size++;
	}
	public Object pop() {
		if(isEmpty()) {	
			size--;
			return stack[top--];
		}
		return 0;
	}

}
