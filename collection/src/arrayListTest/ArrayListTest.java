package arrayListTest;

import java.util.ArrayList;

public class ArrayListTest<T> {

//	<?>: 제네릭 -> 포괄적인. T가 타입인겨.
//	이름이 없다 라는 뜻.
//	지금 당장 무슨 타입인지 알수 없을 때 사용한다.
//	또한 사용자가 어떤 타입의 데이터를 넣을지 모르기 때문에
//	객체화를 시킬 때 정해 준다.
	T data;
	
	
	public static void main(String[] args) {
		ArrayList<String> datas = new ArrayList<String>();
		
		datas.add("이규혁");
		datas.add("소훈");
		datas.add("써니");
		datas.add("예스");
		datas.add("의미");
		
		
		System.out.println(datas);
		System.out.println(datas.get(3));
		
		String prev = datas.set(3, "노");
		
		System.out.println(datas.get(3));
		
		String removed = datas.remove(0);
		System.out.println(removed);
		System.out.println(datas.get(3));
		
	}
	
	
}
