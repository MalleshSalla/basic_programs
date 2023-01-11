package com.basicprograms;

public class MainClass2 {
	public static void main(String[] args) {
		Demo1 d = new Demo1() {
			public int multi(int a, int b) {
				int c = 100;
				System.out.println(c);
				return a * b;
			}

			public int sub(int a, int b) {
				return a - b;
			}
		};

		System.out.println(d.multi(11, 11));
		System.out.println(d.sub(20, 10));

		Demo2 d2 = new Demo2() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		
		System.out.println(d2.add(200, 20));
		System.out.println(d2.a);
		System.out.println(d2.b);
	}
}

abstract class Demo1 {
	public abstract int multi(int a, int b);

	public abstract int sub(int a, int b);
}

abstract class Demo2 {
	public int a = 100;
	public int b = 200;

	public abstract int add(int a, int b);
}
