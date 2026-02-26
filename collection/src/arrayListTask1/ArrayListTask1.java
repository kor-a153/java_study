package arrayListTask1;

import java.util.ArrayList;

public class ArrayListTask1 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		for(int i =0; i < 10 ; i ++) {
			datas.add((i + 1) * 10);
		}
		System.out.println(datas);
		
//		실습 
//		50뒤에 500 삽입
		datas.add(5, 500); // 배열이 바뀌면 50뒤에 안되니까 
//		50의 위치를 검사하고 그 위치 뒤에 500을 추가 해야 했음.
		if(datas.contains(50)) {
			datas.add(datas.indexOf(50)+1 , 500);
		}
		System.out.println(datas);
		
//		80삭제
//		1. 인덱스로 삭제
		Integer remove = datas.remove(7);
		//그럼 여기도 똑같겠다
		if(datas.contains(80)) {
			datas.remove(datas.indexOf(80));
		}
		System.out.println(datas);
		
//		60 삭제
//		2. 값으로 삭제
		if(datas.contains(60)) {
//			wrapper class -> 부모의 클래스로 바꿔주는 작업.
		datas.remove(Integer.valueOf(60)); 
		// Integer 안의 60을 찾아서 끄집어 낸후 remove로 제거.
		System.out.println(datas);
		}
	}
}
