package forTask;

import java.util.Scanner;

public class ForTask {
   public static void main(String[] args) {
//      1~10까지 반복 후 5~8을 제외하고 출력
	   
//	   for (int i=0; i < 10 ; ++i  ) {
//		   if (!(3<i) || !(i < 8)) {System.out.println(i+1);}
		   
//	   강사님 해답.
//	   	{
////	      1~10까지 반복 후 5~8을 제외하고 출력
//	      for(int i = 0; i < 6; i++) {
//	         int value = i + 1;
//	         System.out.println(value > 4 ? value + 4 : value);
//	      }
		      
//	      브론즈
//	      1. 1~100까지 출력
//		   for (int i=0 ; i < 100 ; ++i  ) {
//			   System.out.println(i+1);
//		   }
//	      2. 100~1까지 출력
//		   for (int i=0 ; i < 100 ; ++i  ) {
//			   System.out.println(100-i);
//		   }
//	      골드
//	      1. 1~10까지 누적합을 출력
//	   		int total = 0;
////	   		누적 받을 공간을 만들어 두기
////	   근데 어떻게 넣냐 ?
//		   for (int i=0 ; i < 10 ; ++i  ) {
//			   total += i+1;
//		   } // 이렇게 하면 1~10까지의 모든 누적합이 나옴. 마지막거 하나만 나오게 하려면 ?
//		   System.out.println(total);
//		   //프린트를 바깥으로 빼면 됨 ....
		   
//	      2. 1~n까지 누적합 출력
//		   int total = 0 , n = 0;
////		   scanner와 nextint 로 값을 입력 받기 
//		   Scanner sc = new Scanner(System.in);
//		   String message = "총합할 숫자를 입력하세요";
//		   System.out.println(message);
//		   n = sc.nextInt();
////		   받은값을 i에 넣어주기..
//		   for (int i=0 ; i < n ; ++i  ) {
//			   total += i+1;}
////	   		받은 값으로 for문 돌려
//		   System.out.println(total);
	      
		   
//	      플레티넘
//	      1. A~F까지 출력
//		   for (int i=65 ; i < 71 ; ++i  ) {
//			   System.out.println((char)i);
//		   }
//	      2. A~F까지 중 C를 제외하고 출력
//		   for (int i=0 ; i < 5 ; i++  ) {
//			   int value = i + 65;
//	         System.out.println((char)(i > 1 ? value+1 : value ));
//		   }
//		    indexof에 2번째 값만 빼고 출력하려 했는데 안되는듯. 
//	      왜 안됐냐면 indexof는 문자열중에 뽑아내는 거라 그럼
		   // value에 계속 조건을 넣어서 66보다 크다고 해야됐는데 1보다 크다고 하고있었음
		   // 난잡해 보여서 value를 빼고 i를 넣음.
//	      다이아
//	      1. aBcDeFg...Z 출력
//		   for (int i = 0; i < 26; i++) {
//			   int value = i + 97 ;
//			   System.out.print((char)(i%2 > 0 ? value-32 : value ));
//		   }
		   //value 짝수일때 value - 32
		   //그럼 조건이하나. value%2 >1일때(홀수) -> value :아니면 value-32
//	      2. 별찍기 
//	   		5개의 공간. 3번 반복.
//	   		for (int i = 0; i < 2; i++) {
//	   			String star = "*" , blank = " ";
//	   			int n = i+1 ;
//	   			2n-1 * star 2-n * blank
//	   		}
//	   		앞의 빈공간이 2,1,0, 으로 줄어들고
//	   		뒤의 별이 1, 3, 5 로 늘어난다
//	   수열로 정리하면 n=0 2-n 부터 n-- 되고
//			   별은 2m-1 
//	        *
//	       ***
//	      *****
	   	
	      
//	      마스터
//	      1. 해당 문자와 반복할 횟수를 입력하면 문자를 만들어주는 프로그램 
	   String data1 = "" , total = ""; 
	   int num1 = 0;
	   		Scanner sc = new Scanner(System.in);
	 	   String message = "알파벳과 정수를 입력하세요 \nex) a2t4";
	 	   
		   System.out.println(message);
		   data1 = sc.next();
//		   num1 = sc.nextInt();//알파벳이랑 숫자 같이 받아야 해서 int는 필요없음....
		   
		   total = data1;
		   
//	   		scanner로 값을 받는다. 문자와반복 갯수를 싹 다.
//	   		받은 값을 나눌수 있어야함. 
//	   		각각 구간별로 다른 값을 받을수 있어야 함. (저장공간이 여러개 필요?)
//	      단 반복할 횟수는 1~9까지만 입력할 수 있다.
//	      입력 예시) a1b3c2
//	      출력 예시) abbbcc
	   		
	      
//	      2. 사용자가 입력한 횟수가 얼마인지 모르고,
//	      입력한 횟수 만큼 문자를 만들어주는 프로그램
//	      입력 예시) a1b22c357
//	      출력 예시) abbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc...
	   }

}

//package forTask;
//
//import java.util.Scanner;
//
//public class ForTask {
//   public static void main(String[] args) {
////      1~10까지 반복 후 5~8을 제외하고 출력
////      for(int i = 0; i < 6; i++) {
////         int value = i + 1;
////         System.out.println(value > 4 ? value + 4 : value);
////      }
//      
////      브론즈
////      1. 1~100까지 출력
////      for(int i = 0; i < 100; i++) {
////         System.out.println(i + 1);
////      }
//      
////      2. 100~1까지 출력
////      for(int i = 0; i < 100; i++) {
////         System.out.println(100 - i);
////      }
//      
////      골드
////      1. 1~10까지 누적합을 출력
////      String result = "누적합 결과: %d";
////      int total = 0;
////      for(int i = 0; i < 10; i++) {
////         total += i + 1;
////      }
////      System.out.printf(result, total);
//      
//      
////      2. 1~n까지 누적합 출력
////      Scanner sc = new Scanner(System.in);
////      int count = 0, total = 0;
////      String message = "누적합할 정수를 입력하세요.\nex)12", result = "까지 총합: %d";
////      
////      System.out.println(message);
////      count = sc.nextInt();
////
////      for(int i = 0; i < count; i++) {
////         total += i + 1;
////      }
////      
////      System.out.printf(count + result, total);
//      
//      
////      플레티넘
////      1. A~F까지 출력
////      for(int i = 0; i < 6; i++) {
////         System.out.print((char)('A' + i));
////      }
//      
////      2. A~F까지 중 C를 제외하고 출력
////      for(int i = 0; i < 5; i++) {
////         System.out.print((char)('A' + (i > 1 ? i + 1 : i)));
////      }
//      
////      다이아
////      1. aBcDeFg...Z 출력
////      for(int i = 0; i < 26; i++) {
////         System.out.print((char)((i % 2 == 0 ? 97 : 65) + i));
////      }
//      
////      2. 별찍기 
////        *
////       ***
////      *****
////      for(int i = 0; i < 10; i+=2) {
////         if(i == 0) { continue; }
////         for(int j = 10; j > i; j-=2) {
////            System.out.print(" ");
////         }
////         for(int k = 1; k < i; k++) {
////            System.out.print("*");
////         }
////         System.out.println();
////      }
////      
////      마스터
////      1. 해당 문자와 반복할 횟수를 입력하면 문자를 만들어주는 프로그램 
////      단 반복할 횟수는 1~9까지만 입력할 수 있다.
////      입력 예시) a1b3c2
////      출력 예시) abbbcc
////      Scanner sc = new Scanner(System.in);
////      String message = "문자와 반복할 횟수를 붙여서 입력하세요.\nex)a1b2c5",
////            input = null, result = "";
////      
////      System.out.println(message);
////      input = sc.next();
////      
////      for(int i = 0; i < input.length(); i++) {
////         if(i % 2 == 0) {
////            char c = input.charAt(i);
////            int count = input.charAt(i + 1) - 48;
////            for(int j = 0; j < count; j++) {
////               result += c;
////            }
////         }
////      }
////      
////      System.out.println(result);
//      
//      
////      2. 사용자가 입력한 횟수가 얼마인지 모르고,
////      입력한 횟수 만큼 문자를 만들어주는 프로그램
////      입력 예시) a1b22c357
////      출력 예시) abbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc...
//      Scanner sc = new Scanner(System.in);
//      String message = "문자 + 숫자 형식의 문자열을 입력하세요.\nex)a1b22c347",
//            input = null, result = "";
//      
//      System.out.println(message);
//      input = sc.next();
//      
//      for(int i = 0; i < input.length(); i++) {
//         char c = input.charAt(i); // 문자
//         
//         String numberStr = "";
//         i++;
////         다음 문자부터 숫자 읽기 시작
//         while(i < input.length() && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
//            numberStr += input.charAt(i);
//            i++;
//         }
//         
//         int count = Integer.parseInt(numberStr);
//         
//         for(int j = 0; j < count; j++) {
//            result += c;
//         }
//         i--;
//      }
//      
//      System.out.println(result);
//   }
//}


