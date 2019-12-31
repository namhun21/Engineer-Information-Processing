package datastructure;
import java.util.*;
public class section37 {
	
	class Stack<T>{
		class Node<T>{
			T data;
			Node<T> next;
			
			Node(T data){this.data = data;}
		}
		Node<T> top;
		
		
		 void push(T data) {
			 Node<T> n = new Node(data);
			if(top == null)
				top = n;
			else {
				n.next = top;
				top = n;
			}
		}
		 T pop() {
			 T item = top.data;
			 if(top == null)
				 System.out.println("Stack Empty");
			 else {
				 
				 top = top.next;
			 }
			 return item;
		 }
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
