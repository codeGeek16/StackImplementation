package com.sahil.stackLinkedListImpl;

import com.sahil.stackPojo.Data;

public class StackNode {

	Data d;
	StackNode next;
	static StackNode root = null;
	
	public Data getD() {
		return d;
	}
	public void setD(Data d) {
		this.d = d;
	}
	public StackNode getNext() {
		return next;
	}
	public void setNext(StackNode next) {
		this.next = next;
	}
	
	public StackNode newNode(Data d){
		StackNode stackNode  = new StackNode();
		stackNode.setD(d);
		stackNode.setNext(null);
		return stackNode;
	}
	
	boolean isEmpty(StackNode root){
		return root==null;
	}
	
	public void push(Data d){
		StackNode stackNode = newNode(d);
		stackNode.next = root;
		root = stackNode;
		System.out.println("data pushed"+d);
	}
	
	public Data pop(){
		if(isEmpty(root)){
			return null;
		}
		else
		{
			StackNode temp = root;
			root = root.next;
			return temp.d;
		}
	}
	
	public Data peek(){
		if(isEmpty(root)){
			return null;
		}
		else
			return root.d;
	}
	
	public static void main(String[] args) {
		StackNode newNode = new StackNode();
		for(int i=0;i<6;i++)
		{
			Data d = new Data();
			d.setAge(i);
			d.setName("Name"+i);
			newNode.push(d);
		}
		for(int i=0;i<8;i++)
		{
			Data d =newNode.pop();
			if(d!=null)
			{
				System.out.println("Data popped"+d.toString());
			}
			else
			{
				System.out.println("The stack is empty");
			}
		}
		Data d = newNode.peek();
		if(d!= null)
		System.out.println(d);
		else
		{
			System.out.println("Stack is empty!"); 
		}
		
	}
}
