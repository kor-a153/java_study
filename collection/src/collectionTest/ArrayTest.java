package collectionTest;

public class ArrayTest {
	public static void main(String[] args) {
//		배열의 특징
//		1. 인덱스(방번호)
//		2. 순서(시퀀스, iterable)가 있는 자료구조
//		3. 크기가 고정.
		
		int[] arr = new int[3];
		arr[3] = 10 ; // 안됨 why ? 배열의 크기를 넘어 섰기 때문에.
		
		int[] ardata = new int [2];
		int[] artemp = new int [2];
		ardata[0] = 10;
		ardata[1] = 20;
		
		artemp[0] = ardata[0];
		artemp[1] = ardata[1];
		
		ardata = new int[3];
		
		ardata[0] = artemp[0];
		ardata[1] = artemp[1];
		ardata[2] = 30;
		// 이러면 추가로 회원가입하면? 기존정보 날아감. 
		//그래서 temp라는 새로운 저장공간을 만들어줌.
	}
}
