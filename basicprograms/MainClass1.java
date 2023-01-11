package com.basicprograms;

//Using inner class with lambda
public class MainClass1 {
	public static void main(String[] args) {
		AbstractClass a = new AbstractClass() {
			public void multi(int a, int b) {
				System.out.println(a * b);
			}
		};
		a.multi(10, 20);
	}
}

abstract class AbstractClass {
	public abstract void multi(int a, int b);
}

/*
 * This is convention way of implements abstract method
 * 
 * public class MainClass1 { public static void main(String[] args) { B b=new
 * B(); b.move(); } } abstract class A { public abstract void move(); } class B
 * extends A { public void move() {
 * System.out.println("This is implementation of class A "); } }
 */
