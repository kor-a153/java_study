package classTest;

// 부모
class Car {
	public Car() {;}
// 부모의 코드
	void engineStart() {
		System.out.println("열쇠로 시동을 켬");
	}
}


// 자식
class SuperCar extends Car {
	public SuperCar() {;}
	
//	부모의 코드
	void engineStart() {
		System.out.println("음성으로 시동을 켬");
	}
//  자식의 코드
	void openRoof() {
		System.out.println("뚜껑 오픈");
	}
}


public class ClassTest {
	public static void main(String[] args) {
		Car matiz = new Car ();
		SuperCar ferrari = new SuperCar();
		
//		up casting
		Car noOptionFerrari = new SuperCar();
		
		
//		up casting 객체와 부모의 객체는 다르다.
//		- 오버라이딩 된 메서드의 결과가 다르다.
		matiz.engineStart();
		noOptionFerrari.engineStart();
		
//		error
//		SuperCar fullOptionferrari = new car();
		
//		down casting
		SuperCar fullOptionferrari = (SuperCar)noOptionFerrari;
		fullOptionferrari.openRoof();
		
		
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionferrari instanceof Car);
		System.out.println(fullOptionferrari instanceof SuperCar);
		
		
		
		
	//	instanceof 객체가 특정 클래스에 속하는지 아닌지를 확인할 수 있다.
	}
}
