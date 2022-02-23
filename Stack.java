package Stack;

import java.util.EmptyStackException;

public class Stack {
	
	private Listnode top;
	private int length;
	
	private class Listnode{
		private int data;
		private Listnode next;
		
		public Listnode(int data) {
			this.data = data;
		}
	}
		public Stack() {
				top = null;
				length = 0;
		}
		
		public int length() {
			return length;
		}
		
		public boolean isEmpty() {
			return length == 0;
		}
		
		public void push(int data) {
			Listnode temp = new Listnode(data);
			temp.next = top;
			top = temp;
			length++;
		}
		
		public int pop() {
			if(isEmpty()) {
				throw new EmptyStackException();
			}
			
			int result = top.data;
			top = top.next;
			length--;
			return result;
		}
		
		public int peek() {
			if(isEmpty()) {
				throw new EmptyStackException();
			}
			
			return top.data;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());

		
	}

}
