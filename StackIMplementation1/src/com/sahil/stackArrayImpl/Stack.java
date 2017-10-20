package com.sahil.stackArrayImpl;

import com.sahil.stackPojo.Data;

public class Stack {
	
	Data[] holdData;
	int top;
	int capacity;

	
	public Stack(int capacity){
		this.top = -1;
		this.capacity = capacity;
		this.holdData = new Data[capacity];
	}
	
	
	public Data[] getHoldData() {
		return holdData;
	}

	public void setHoldData(Data[] holdData) {
		this.holdData = holdData;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	boolean isStackFull(){
		if(top== capacity-1)
			return true;
		else
			return false;
	}
	
	boolean isStackEmpty(){
		if(top== -1)
			return true;
		else
			return false;
	}
 
	void push(Data data){
		if(!isStackFull()){
			holdData[++top]=data;
			System.out.println("Pushed to stack:"+data.toString());
		}
		else
		{
			System.out.println("Stack is full");
		}
	}
	
	Data pop(){
		if(!isStackEmpty()){
			return holdData[top--];
		}
		else
			return null;
	}
	
	Data peek(){
		if(!isStackEmpty()){
			return holdData[top];
		}
		else
			return null;
	}
	
	public static void main(String args[]){
		Stack st = new Stack(5);
		for(int i=0;i<6;i++)
		{
			Data d = new Data();
			d.setAge(i);
			d.setName("Name"+i);
			st.push(d);
		}
		for(int i=0;i<3;i++)
		{
			Data d =st.pop();
			if(d!=null)
			{
				System.out.println("Data popped"+d.toString());
			}
			else
			{
				System.out.println("The stack is empty");
			}
		}
		Data d= st.peek();
		if(d!= null)
			System.out.println("The top most data is"+d.toString());
		else
			System.out.println("Stack is empty");
		for(int i=0;i<3;i++){
				Data d1 =st.pop();
				if(d1!=null)
				{
					System.out.println("Data popped"+d1.toString());
				}
				else
				{
					System.out.println("The stack is empty");
				}
		}
	}
}
