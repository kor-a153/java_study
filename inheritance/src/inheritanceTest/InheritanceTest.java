package inheritanceTest;

class A {
	String name;
	int data;
	
	public A() {
		this.name = "A";
		this.data = 10;
		System.out.println("A :" + this);
		System.out.println("A자식 생성자 호출");
	}

	void printName() {
		System.out.println(this.name);
	}

class B extends A {
	public B () {
		System.out.println("B :" + this);
		System.out.println("B자식 생성자 호출");
	}
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.printName();
		b.printName();
	}
}
