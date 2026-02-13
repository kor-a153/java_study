package arrayTask;

import java.util.Arrays;

public class ArrayTask03 {
   public static void main(String[] args) {
//      플레티넘
//      1. 사용자의 입력값을 변환
//      사용자에게 입력 받은 문자열 중 소문자는 대문자로(값 + 32), 대문자는 소문자(값 - 32)로 변환하여 모두 배열에 담고 출력
//	   sc 로 입력 받기. next(); 그럼 문자열임 .문자형이 되어야 아스키가 됨. 
//	   일단 배를 째야되지 않나 ? 배열에 각각 담기. 를 먼저 해야할거같은데.헐 아스키코드 한글 있음.
//	   하 이 hi he안ll녕o 을 받으면 어떻게 ... 입력받은값을 split ?
//      입력 예시) 안녕hi!
//      출력 예시) 안녕HI!
//	   String str = "12345";
//	   char[] Arr1 = str.toCharArray();
//	   if 만약에
//	   값을 i로 받았고 받은 i의 배열 하나하나를 검사해.
//	    그 배열의 값이 65~90 , 97~122 이고 그게 65~91이라면 +32 95~121이라면 -32
//	   그 안에 값이 없으면 그냥 아무것도 하지 말어.
      
//	   그리고 다시 하나로 합치고 문자열로,
//	   합친 문자열을 배열에 넣어..?
	   
//      2. 사용자가 입력한 모든값을 반대로 뒤집어주는 결과를 모두 배열에 담고 출력
//	   입력 받아 ... 값을 반대로... 인덱스 값을 빼내서 가지고 있는 인덱스값을 
//	   인덱스길이 - 인덱스 값 .Collections.reverse(list) 라는게 있네..
	   
//      입력 예시) apple
//      출력 예시) elppa
	   Scanner sc = new Scanner(System.in);
	   String[] data = new String[5];
	   data = null;
	   String[] arr = { "1", "2", "3", "4", "5" };
	   String[] reverseArr = new String[5];
	   
	   
	   for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
		   reverseArr[j] = arr[i];        
	   }
	   System.out.println("reverseArr : " + Arrays.toString(reverseArr));
      
//      다이아
//      계산기 만들기
   }
}

강사님 코드
//package arrayTask;
//
//import java.util.Scanner;
//
//public class ArrayTask03 {
//   public static void main(String[] args) {
////      플레티넘
////      1. 사용자의 입력값을 변환
////      사용자에게 입력 받은 문자열 중 소문자는 대문자로, 대문자는 소문자로 변환하여 모두 배열에 담고 출력
////      입력 예시) 안녕 hi!
////      출력 예시) 안녕 HI!
//      
////      "".toUpperCase();
////      "".toLowerCase();
////      Scanner sc = new Scanner(System.in);
////      String message = "대문자 또는 소문자로 변경할 내용을 입력하세요.\nex)안녕 hi!",
////            input = null;
////      char[] result = null;
////      int gap = 32;
////      
////      System.out.println(message);
////      input = sc.nextLine();
////      result = new char[input.length()];
////      
////      for(int i = 0; i < input.length(); i++) {
////         char c = input.charAt(i);
////         if(c >= 65 && c <= 90) {
////            // 대문자
////            result[i] += (char)(c + gap);
////         }else if(c >= 97 && c <= 122) {
////            // 소문자
////            result[i] += (char)(c - gap);
////         }else {
////            result[i] += c;
////         }
////      }
////      
////      for(int i = 0; i < result.length; i++) {
////         System.out.print(result[i]);
////      }
//      
////      2. 사용자가 입력한 모든 값을 반대로 뒤집어서 모두 배열에 담고 결과를 출력
////      입력 예시) apple
////      출력 예시) elppa
//      Scanner sc = new Scanner(System.in);
//      String message = "반대로 뒤집을 글자를 입력하세요.", input = null;
//      char[] result = null;
//      
//      System.out.println(message);
//      input = sc.nextLine();
//      result = new char[input.length()];
//      
//      for(int i = 0; i < input.length(); i++) {
//         result[i] = input.charAt(input.length() - i - 1);
//         System.out.print(result[i]);
//      }
//   }
//}

