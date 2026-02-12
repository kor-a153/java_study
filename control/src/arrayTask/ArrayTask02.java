package arrayTask;

public class ArrayTask02 {
   public static void main(String[] args) {
      
//      골드
//      1. 사용자가 몇 개를 입력할 지 모를 때,
	   String message = "숫자를 입력하세요\nex) 정수 or 실수";
	   Scanner sc = new Scanner(System.in);
	   int[] arData = new int[5];
	   int count = 0, min = 0, max = 0;
//      입력한 모든 값을 배열에 담은 후 최댓값과 최솟값을 출력
//	   배열에 뭐라고 해야될까 ? 그리고 어떻게 끝낼까?=sc.close();?라는게 있다.
//	   무제한 받을수 있는 배열과  -> 어떻게 만들지? [5]>=arData ? length*2 ? 
//	   입력을 끝내는게 필요.
//	   배열이 일정 수에 도달하면 배열을 늘리는 코드. 초기배열을 5로
//	   종료 하면 최대최소를 구해 출력.
	   while(true) {
         System.out.print(count + 1 + message);
         arData[count] = sc.nextInt();
         count++;
         if(count > n) {
            break;
      if arData = 
//      2. 사용자가 몇 개를 입력할 지 모를 때,
//      입력한 모든 값을 배열에 담고, 실수와 정수의 개수를 출력
//      입력예시) "10", "10.7", "2", "3.6"
//	   String으로 받아야 하고. contains(".")을 하고 ? (스크립트에선 include)
//	   ture 나온만큼 실수. 전체배열개수(배열.length) - 실수개수 = 정수개수
//      출력예시) 실수 2(ture 나온만큼)개, 정수 2(전체배열개수(배열.length) - 실수개수)개
      
   }
}
//	   강사님코드
////     골드
////     1. 사용자가 몇 개를 입력할 지 모를 때,
////     입력한 모든 값을 배열에 담은 후 최댓값과 최솟값을 출력
////     Scanner sc = new Scanner(System.in);
////     int[] arData1 = null;
////     int count = 0, min = 0, max = 0;
////     String message1 = "배열의 길이를 입력하세요.";
////     
////     System.out.println(message1);
////     count = sc.nextInt();
////     arData1 = new int[count];
////     
////     for(int i = 0; i < count; i++) {
////        System.out.println(i + 1 + "번 째 정수를 입력하세요.\nex)10");
////        arData1[i] = sc.nextInt();
////     }
////     
////     min = arData1[0];
////     max = arData1[0];
////     
////     for(int i = 0; i < arData1.length; i++) {
////        if(min > arData1[i]) { min = arData1[i]; };
////        if(max < arData1[i]) { max = arData1[i]; };
////     }
////     
////     System.out.printf("최솟값: %d 최댓값: %d", min, max);
//     
////     2. 사용자가 몇 개를 입력할 지 모를 때,
////     입력한 모든 값을 배열에 담고, 실수와 정수의 개수를 출력
////     입력예시) "10", "10.7", "2", "3.6"
////     출력예시) 실수 2개, 정수 2개
//     Scanner sc = new Scanner(System.in);
//     String[] arData2 = null;
//     int arData2Length = 0, integerCount = 0, floatCount = 0;
//     String message1 = "배열의 길이를 입력하세요.";
//     
//     System.out.println(message1);
//     arData2Length = sc.nextInt();
//     arData2 = new String[arData2Length];
//     
//     for(int i = 0; i < arData2Length; i++) {
//        
//        System.out.println(arData2Length + 1 + "번 째 값을 입력하세요\nex)10 or 11.2");
//        
//        String input = sc.next();
//        arData2[i] = input;
//        
//        if(input.contains(".")) {
//           floatCount++;
//        }else {
//           integerCount++;
//        }
//     }
//     
//     System.out.printf("실수: %d개, 정수: %d개", floatCount, integerCount);