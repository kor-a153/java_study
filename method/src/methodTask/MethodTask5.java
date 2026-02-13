package methodTask;

import java.util.Scanner;

public class MethodTask5 {

    // static 없음
    int[] quotientRemainder(int a, int b) {
        return new int[]{ a / b, a % b };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수(0 제외): ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없음");
            return;
        }

        MethodTask5 mt = new MethodTask5();
        int[] result = mt.quotientRemainder(num1, num2);

        System.out.println("몫: " + result[0]);
        System.out.println("나머지: " + result[1]);
    }

	   
//      2. 사용자가 입력하는 값중 정수 분리하기
    //분리하기 라는 메서드.
//      입력 예시)
//      안1녕2하3세4요
//      출력 예시)
//      1234
      
//      3. 사용자가 입력한 글자와 찾을 글자를 입력하면 글자의 개수를 반환해주는 메서드
//    글자의 개수를 반환해주는 메서드
//      입력 예시) apple
//      찾을 글자 p
//      반환 2
      
//      4. 5개 정수를 배열로 마구잡이로 전달할 때 가장 작은 2개의 숫자를 배열에 담아 전달하는 메서드
      
//      5. 랜덤한 값을 100칸 배열에 담은 후 배열 안의 값 중 홀수의 합만 출력
      
//      6. 연속된 중복 문자 제거하기
//      입력 예시1)
//      abbbbacda
//      출력 예시1)
//      aacda
      
//      입력 예시2)
//      aabbccccd
//      출력 예시2)
//      abcd
      
}











