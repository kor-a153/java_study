package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 extends StreamTask {
	
public static String valueOf(User user) {
    return user.getName(); // 매개변수로 유저를 넣으면 그 안에서 유저의 이름을 가져오는 메서드
}

	public static void main(String[] args) {
	      User user1 = new User(1L, "홍길동", 20, "개발자", "남"); 
	      User user2 = new User(2L, "장보고", 30, "기획자", "남"); 
	      User user3 = new User(3L, "이순신", 35, "사장", "남"); 
	      User user4 = new User(4L, "김영희", 25, "간호사", "여"); 
	      User user5 = new User(5L, "김철수", 35, "소방관", "남"); 
	      User user6 = new User(6L, "김영숙", 22, "유튜버", "여"); 
	      
	      ArrayList<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3, user4, user5, user6));
//	      유저의 이름만 모두 붙여서 출력 - 붙이는거 조인
	      
	      String result = users
		    .stream()
	        .map(StreamTask3::valueOf)
	        .collect(Collectors.joining(","));
	      
	      System.out.println(result);
	      
//	      String result = IntStream
//	              .rangeClosed(0, 25)
//	              .map(StreamTask2::add97)
//	              .filter(StreamTask2::isOdd)
//	              .mapToObj(StreamTask2::valueOf)
//	              .map(String::valueOf)
//	              .collect(Collectors.joining(""));
	      
	      
//	      유저의 성별이 남이라면 "man"
//	      여 라면 "woman"으로 바꿔서 모두 출력하기
	      
//	      유저에서 getGender로 가져와. 남자일때 equals = 1 이면 man
//	      else 면 woman 출력
	      
	      
	      
	}
}
