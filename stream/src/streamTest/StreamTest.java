package streamTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

//	JDK8 API
//	map
//	filter
//	forEach
public class StreamTest {
	public static void main(String[] args) {
		
//		
//		IntStream.range(0,10).forEach((num)-> {System.out.println(num);}); // 반복할수 있는 인터페이스 생성.
//		
//		ArrayList<Integer> number = new ArrayList<Integer>();
//		IntStream.range(1, 50).forEach((num) -> {number.add(num );});
//		
		
//      .forEach()
//      1. numbers2를 ArrayList 생성
//      2. 1~50까지 짝수만 numbers2에 추가하고 모두 출력하기
		
//		ArrayList<Integer> number2 = new ArrayList<Integer>();
//		IntStream.range(1, 50).forEach((num2) -> {
//			if(num2 % 2 == 0) {
//				number2.add(num2);
//			}
//			});
//		
		
		//참조형
//		.(객체명 :: 메서드명)
//		number2.forEach(System.out::println);
		
		
//		number3
//      ArrayList numbers3를 생성하고
//      참조형으로 numbers3에 1~10까지 값을 추가하기
		
//		ArrayList<Integer> number3 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1,10).forEach(number3::add);
//		System.out.println(number3);
		
//		문자열 stream
//		.chars()
//		String data = "ABCDEF";
		
//		1.참조를 하면 안되는 순간
//		문자형 출력이 불가능 -> 목적에 맞지 않음
//		data.chars().forEach((c) -> {System.out.println((char)c);});
		
//		2. 0 삭제 -> 1번째 인덱스가 0번째 인덱스를 갖게된다.
//		즉 삭제를 할때 값을 건너뛰게 되어 참조형 사용이 불가능하다.
//		ArrayList<Integer> numbers4 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(numbers4 :: add);
//		System.out.println(numbers4);
//		IntStream.range(0, 5).forEach(numbers4 :: remove);
//		System.out.println(numbers4);
		
		
//		.map() : 기존 값을 변경할 때 사용하는 메서드
//		* return이 반드시 필요하다.
//		1~10까지 추가
//		ArrayList<Integer> numbers5 = new ArrayList<Integer>();
//		IntStream.range(0, 10).map((n) -> n+1).forEach(numbers5::add);
//		System.out.println(numbers5);
		
		
		String data = "ABCDEFG";
//		data를 "abcdefg" 로 변경하여 출력
		
		data.chars().map((c)-> c+32).forEach((c) -> System.out.print((char)c));
		//데이터를 먼저 chars로 바꿔준다. 이후 map을 수정. 수정을 어떻게 할건지는 람다 함수로. c를 c에 32fmf ejgotj.
//		forEach는 값을 출력 해준다.
		
	}
}
