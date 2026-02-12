package arrayTask;

import java.util.Scanner;

public class ArrayTask01 {
   public static void main(String[] args) {
//      브론즈
//      1. 1~100까지 배열에 담은 후 홀수만 출력
//       int[] arData1 = new int[100]; //100 개짜리 배열을 만들어 주고.
////
//       // 1~100 배열에 담기
//       for (int i = 0; i < 100; i++) {
//           arData1[i] = i + 1;
//       }
//////
//////       // 홀수만 출력
//       for (int i = 0; i < arData1.length; i++) {
//           if (arData1[i] % 2 == 1) {
//               System.out.println(arData1[i]);
//           }
//       }

//      1. 10~1까지 중 짝수만 배열에 담고 출력
//       int[] arData = new int[11]; //100 개짜리 배열을 만들어 주고.
//
//       for (int i = 10; i > 0; i--) {
//           arData[i] = i;
//           System.out.println(arData[i]);
//       }

       // 홀수만 출력
//	   	3. 1~77까지 중 짝수만 배열에 담고 출력
//       int[] arData = new int[77];
//
//       for (int i = 0; i < arData.length; i++) {
//           arData[i] = i + 1;
//       }
//       
////     // 짝수만 출력
//     for (int i = 0; i < 77; i++) {
//         if (arData[i] % 2 == 0) {
//             System.out.println(arData[i]);
//         }
//     }
//      실버
//      A~F까지 배열에 담고 출력
//	   int[] arData = new int[6];
////     	아스키 코드로 65~ 위로 5개 출력.
////	   arData에 숫자 담기.
//	   for (int i = 0; i < 5; i++) {
//         arData[i] = i + 1;
//	   }
//	   
//	   for (int i = 0; i < arData.length; i++) {
//		   arData[i] = i + 65 ;
//		   System.out.println((char)(arData[i]));
//	   }
     
//      5개의 정수를 입력 받고 배열에 담은 후 최댓값과 최솟값을 출력+
	   //입력받을 스캐너와 공간 만들기.
	   Scanner sc = new Scanner(System.in);
	   int[] numbers = new int[5];
	   
       int max = numbers[0]; // 배열의 최소값. [0]?
       int min = numbers[0];
       
//	   입력 받으려면 nextint로 받고
       System.out.println("정수 5개를 입력하세요:");
       for (int i = 0; i < numbers.length; i++) {
           numbers[i] = sc.nextInt();
       }
       
       min = numbers[0];
       max = numbers[0];
       
//	   최대 최소값 비교
       for (int i = 1; i < numbers.length; i++) {
           if (numbers[i] > max) {
               max = numbers[i]; // 크다면 큰걸 number를 max에 넣는다. 아니면 은 굳이 필요 없음.
           }
           if (numbers[i] < min) {
               min = numbers[i];
           }
       } 
       
       System.out.println("최대값: " + max);
       System.out.println("최소값: " + min);
	   
//	   배열에 담으려면 새로운 배열 만들고 , 받을 배열 공간 만들어 주고.
//	   배열의 크기를 for문으로 비교해서 최대값, 최솟값을 구하고.
//	   결과값을 출력.
   }
}


//강사님코드 
//package arrayTask;
//
//import java.util.Scanner;
//
//public class ArrayTask01 {
//   public static void main(String[] args) {
////      브론즈
////      1. 1~100까지 배열에 담은 후 홀수만 출력
////      int[] arData1 = new int[100];
////      for(int i = 0; i < arData1.length; i++) {
////         int value = i + 1;
////         arData1[0] = value;
////         if(value % 2 == 0) {
////            System.out.println(i);
////         }
////      }
//      
////      2. 10~1까지 중 짝수만 배열에 담고 출력
////      int[] arData2 = new int[5];
////      for(int i = 0; i < 5; i++) {
////         arData2[i] = (i + 1) * 2;
////         System.out.println(arData2[i]);
////      }
//      
////      3. 1~77까지 중 짝수만 배열에 담고 출력
////      int[] arData3 = null;
////      arData3 = new int[77 / 2];
////      for(int i = 0; i < arData3.length; i++) {
////         arData3[i] = (i + 1) * 2;
////         System.out.println(arData3[i]);
////      }
//      
////      실버
////      A~F까지 배열에 담고 출력
////      char[] chars = new char[6];
////      for(int i = 0; i < chars.length; i++) {
////         chars[i] = (char)('A' + i);
////         System.out.println(chars[i]);
////      }
//      
////      5개의 정수를 입력 받고 배열에 담은 후 최댓값과 최솟값을 출력
//      String message = "번 째 정수를 입력하세요.\n";
//      Scanner sc = new Scanner(System.in);
//      int[] arData4 = new int[5];
//      int count = 0, min = 0, max = 0;
//      
//      while(true) {
//         System.out.print(count + 1 + message);
//         arData4[count] = sc.nextInt();
//         count++;
//         if(count > 4) {
//            break;
//         }
//      }
//      
//      min = arData4[0];
//      max = arData4[0];
//      
//      for(int i = 1; i < arData4.length; i++) {
//         if(min > arData4[i]) { min = arData4[i]; }
//         if(max < arData4[i]) { max = arData4[i]; }
//      }
//      
//      System.out.println("최댓값: " + max);
//      System.out.println("최솟값: " + min);
//      
//   }
//}


Scanner sc = new Scanner(System.in);
String[] arData2 = null;
int arData2Length = 0, integerCount = 0, floatCount = 0;
String message1 = "배열의 길이를 입력하세요.";

System.out.println(message1);
arData2Length = sc.nextInt();
arData2 = new String[arData2Length];

for(int i = 0; i < arData2Length; i++) {
 
 System.out.println(arData2Length 
		 + 1 + "번 째 값을 입력하세요\nex)10 or 11.2");
 
 String input = sc.next();
 arData2[i] = input;
 
 if(input.contains(".")) {
    floatCount++;
 }else {
    integerCount++;
 }
}

System.out.printf(
		"실수: %d개, 정수: %d개", floatCount, integerCount);


