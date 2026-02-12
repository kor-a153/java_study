package arrayTask;

import java.util.Scanner;

public class ArrayTask05 {
   public static void main(String[] args) {
//      골드 ~ 플레티넘
//      1. 비밀번호를 암호화해주는 로직을 완성하세요.
//      입력예시)
//      test123!@#
//	   String으로 입력 받음. next(); 
	   
	   Scanner sc = new Scanner(System.in);
     String message = "비밀번호를 입력하세요./nex)엉문,숫자,특수문자 가능", input = null;
     char[] result = null;
     
     System.out.println(message);
     input = sc.nextLine();
     result = new char[input.length()];//인풋의 길이만큼 받으면 무한히 늘어남.
//     그럼 이 result 값을 분해해서 자기자신만큼 뺐다가 다시 아스키? 값만큼 더해.
     
     result 
     
//      비밀번호 이외의 특수문자가 나올 수 있음.
//	   배열로 받아서 배열요소 다 ?에 해당하는 아스키 코드로 변환.스스로에게 스스로를 빼게 하고
//	   그다음 바로 더하기 아스키의 ? 값
	   
//      출력 예시)
//      ???????
      
//      2. 가장 많이 판매된 상품의 총 판매 수익과
//      가장 적게 판매되 상품의 판매 수익의 차를 출력하세요.
//      아메리카노 2000원, 카페라떼 3000원, 에이드 4000원, 밀크쉐이크 5000원
      String[] menus = {"아메리카노", "카페라떼", "에이드", "밀크쉐이크"};
      
//      orders의 정수는 menus의 주문 번호입니다.
      int[] orders = {0, 1, 0, 1, 3, 1, 1, 2, 2, 0, 2, 3, 1, 2, 3, 0, 2, 2, 1, 1, 0};
      
   }
}
