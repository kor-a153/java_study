package objectTest;

public class ObjectTest {
//	1.private -> 왜써 ? 1. 직접접근하지 말라고, 2.이 값은 화면에서 쓸거라고.	
	private String name;
//	2.기본생성자 -> 만들지않으면 누가 만들어줘 ? 컴파일러가 만들어줘.
	public ObjectTest() {;}
//	3.초기화 생성자
	public ObjectTest(String name) {
		super(); // object 인 클래스로 넘어감. 이게 기본 부모임.
		this.name = name;
	}
		
	//	4. getter
	public String getName() {
		return name;
	}
	
	//	5. setter
	public void setName(String name) {
		this.name = name;
	}
	
	//	6. toString(): 해당 객체의 필드를 확인하기 위한 용도
	@Override
	public String toString() {
		return "ObjectTest [name=" + name + "]";
	}
	
		public static void main(String[] args) {
			ObjectTest ot = new ObjectTest();
			System.out.println(ot); // 둘이 값이 같음 즉. 객체를 toString으로 출력해주고 있었음.
			System.out.println(ot.toString());
			// toString의 목적 재정의를 위함 . 
			
			User user1 = new User(1L, "홍길동");
			
//			도서관 책을 대여
			if(user1.equals(new User(1L,"홍길동"))) { // object의 equals 메서드를 쓰고 있는데 그 메서드는 주소를 비교하기 때문에 둘이 계속 틀리다고 비교가 된다.
//				따라서 주소를 비교하지 않고 아이디를 비교하게 하기 위해 equals를 재정의 해 주어야 함. > User로.
				System.out.println("대여완료");
			}else {
				System.out.println("도난 신고");
			}
		}
	}
