package arrayList.Task;

import java.util.ArrayList;

public class UserField {
	
	public ArrayList<User> users = DBConnecter.users;
	public final int KEY = 300 ;
	
	
//		1. 회원가입
//		- id x , name, password, phone
//		- 
//		id 중복 체크
		public User checkId(Long Id) {
			for(User user: users) {
				if(user.getId().equals(Id)) {
					return user;
				}
			}
			System.out.println("이미 사용중인 아이디 입니다.");
			return null;
		}
//		password 암호화
		public String encode(String password) {
			String encodedPassword = "";
			
			for (int i =0 ; i < password.length(); i++) {
				encodedPassword += (char)(password.charAt(i) * KEY);
			}
			return encodedPassword;
		}
	
//		-
		public void join(User user) {
			User userInDB = checkId(user.getId());
			if (userInDB == null) {
				user.setPassword(encode(user.getPassword()));
				users.add(user);
			}
		}
		
		
//		2. 로그인
//		- id, password 화면에서 받음.
//		- DB에 id가 있는지 검사.
//		- id를 찾으면 password 검사
//		- 찾은 user를 리턴
		
		public void login(User user) {
			
			for (int i = 0; i < users.size(); i++) {
			    User dbUser = users.get(i);

		        if (dbUser.getId().equals(user.getId())) {

		            // 2. id는 맞음 → password 검사
		            if (dbUser.getPassword().equals(user.getPassword())) {
		                System.out.println("로그인 성공!");
		                return dbUser;   // 찾은 user 반환
		            } else {
		                System.out.println("비밀번호 불일치!");
		                return null;
		            }
		        }
		        
		        // 3. 모든 유저 검사했는데 id 없음
		        System.out.println("존재하지 않는 아이디입니다.");
		        return null;
		    }
		}
		
//		3. 로그아웃
//		4. 회원탈퇴
//		5. 비밀번호 변경(마이페이지)
//		6. 비밀번호 변경(비밀번호 변경 30일)
//		7. 인증번호 전송
//		8. 인증번호 확인
		
		public static void main(String[] args) {
			UserField uf = new UserField();
			User user1 = new User("hong123" , "홍길동" ,1234, "010-1234-1234");
			User user2 = new User("hong123" , "김동홍" ,1234, "010-4566-7890");
			
			uf.join(user1);
			uf.join(user2);
			System.out.println(uf.users);
	}
	
	
}
