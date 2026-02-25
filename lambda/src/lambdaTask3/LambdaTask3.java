package lambdaTask3;

public class LambdaTask3 {
	public static void main(String[] args) {
		
//   1. 전달한 글자가 등장하는 거리 구하기
//   입력예시
//   "abcdababefda", "a"
//
//   출력예시
//   "3 -> 1 -> 4"
//   만약 중복된 글자가 없어 거리를 찾지 못하면
//   "-1"
		Distance dist = (str, ch) -> {
// 매개변수에 뭘로 받는지는 별로 상관 없음. 단 타입은 인터페이스에 넣은 추상 클래스를 넣어야함.
//			인터페이스에 추상클래스가 아니라 인터페이스의 이름을 넣는거임. 추상 클래스가 아니라 타입임.
        int[] indexArr = new int[str.length()];
//        숫자를 int로 받는데 배열로 받고. 배열의 길이는 String값의 길이만큼 받음.
//        	int의 숫자를 셀수 있도록 카운트 공간을 만들어 줌
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                indexArr[count++] = i;
            }// for에 if문을 돌려서 특정값이 반복될수 있도록 함
//            String에서 뽑아낸 i번째 배열의 값이 받은 문자형과 같다면.
//            그 값의 인덱스를 count에 추가해줌.
        }

        if (count < 2) return "-1";
        //그리고 그 count가 2보다 작으면, 즉 1이하이면 -1을 출력.

        String result = "";
//        result에 빈공간을 만들어 두고.
        for (int i = 0; i < count - 1; i++) {
            int gap = indexArr[i + 1] - indexArr[i];
//            갭에 대한 메서드를 포문으로 해결하는데. i+1번째 인덱스의 배열과
//            i번째 인덱스의 배열값을 빼서 둘 사이 거리를 구함. 
//            이게 구해지는 이유는 카운트로 값을 받았기 때문.
            result += gap;
//            그 결과를 누적해서 담아주고.
            if (i < count - 2) result += " -> ";
//            카운트가 1이라면 결과에 ->를 누적시킴. 그러면 ..? 이 로직이 잘 이해안된다.
        }

        return result;
//        그냥두면 안되고 리턴값을 줘야됐는데 왜 그냥 두면 안됐는지 까먹음
    };

    String input = "abcdabaaewrtda";
    char target = 'a';

    String output = dist.arr(input, target);
//    	output에 dist, 즉 인터페이스 추상클래스에, 추상메서드인 arr를 사용하고.
//    	거기에 미리 공간을 만들어 두었던 input과 char인 target을 넣어줌.

    System.out.println(output);
//    	그리고 output을 출력
//
//   2. 스파이가 남긴 암호를 해독하시오.
//   주어진 소문자(a~z) 범위라 가정한다.
//   주어진 암호를 원래 문자열을 복원하시오.
//
//   "1051081111181011069711897"
	
//	97-122 까지 문자형 값이 있음. 값을 그것대로 끊어야 함. 
//	3개씩 묶어서 판단하고 
//	3개가 안되면 2개를 뽑아내서 (char)num 로 변환. (num으로 받는다면) 
//	
	
	}
}
