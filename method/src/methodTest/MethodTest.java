package methodTest;

public class MethodTest {
	// 이름을 받으면 이름을 출력하는 메서드
	void printName(String name) {
		System.out.println(name); 
		// 출력은 값이 아니라 기능이라 void를 건드릴 필요 없음.
	};
//	두수를 더해서 결과를 반환하는 메서드
	double add(double num1, int num2) {
		return num1 + num2 ; 
	}
}
