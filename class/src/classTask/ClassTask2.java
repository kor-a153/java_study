package classTask;

// 슈퍼카(SuperCar) 클래스 생성
import java.util.Scanner;

class SuperCar {
	String brand , color , password;
	int price , wrongPassword ;
	boolean engine ;
	
	
	public SuperCar() {;}


	public SuperCar(String brand, String color, String password, int price) {
		this.brand = brand;
		this.color = color;
		this.password = password;
		this.price = price;
		this.wrongPassword = 0;
		this.engine = false;
	}
	
	void introduce() {
		System.out.println("브랜드:" + brand);
		System.out.println("색상:" + color);
		System.out.println("가격:" + price);
		System.out.println("엔진상태:" + (engine ? "켜짐" : "꺼짐"));
	}
	
	boolean checkPassword(String input) {
		if (wrongPassword >= 3) {
			System.out.println("경찰 출동");
			return false ;
		}
		if (password.equals(input)) {
			wrongPassword = 0 ;
			return true; 
		} else {
			wrongPassword++;
			System.out.println("비밀번호 오류 (" + wrongPassword + "회)");
			if (wrongPassword >= 3) System.out.println("경찰 출동");
			return false;
		}
	}
// 브랜드, 색상, 가격, 엔진(boolean), 비밀번호, 비밀번호의 오류횟수, 엔진을 킴, 엔진을 끔


void startEngine() {
	if (engine) { //이미 엔진이 true라면
		System.out.println("이미 엔진이 켜져있습니다.");
	} else { // 아니라면 키게 만들어.
		engine = true;
		System.out.println("엔진 ON");
	}
}

void stopEngine() {
	if (!engine) {
		System.out.println("이미 엔진이 꺼져있습니다.");
	} else {
		engine = false;
		System.out.println("엔진 OFF");
	}
}

}


//	비밀번호를 정해두고 비밀번호를 입력받음(sc) => 일치여부 확
//  if 비밀번호와 입력값이 일치한다면 boolean인 engine 을 True로 .
//	일치하지 않는다면 count++ worngPassword
//	if worngPassword >= 3 일 경우 "경찰 출동"
public class ClassTask2 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   SuperCar car = new SuperCar("Lamborghini", "Yellow", "1234", 500000000);
	   
	   car.introduce();
//   1. 슈퍼차 객체화
//   2. 비밀번호를 입력, 비밀번호가 일치한다면 엔진의 시동 여부를 제어(킴 or 끔)
//   3. 비밀번호 3회 오류시 경찰 출동
	   while (true) {
		   if (car.wrongPassword >=3) break;
		   
		   System.out.println("\n비밀번호 입력(종료:exit):");
		   String input = sc.next();
		   
		   if (input.equalsIgnoreCase("exit")) {
               System.out.println("종료");
           break;
	   }
		   if ( car.checkPassword(input)) {
			   if(!car.engine) car.startEngine();
			   else car.stopEngine();
		   }
	   
   }
   }




