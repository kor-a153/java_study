package inheritanceTask;


//   상속 및 분리 실습
//   
class InhertanceTask {
	String work , sleep , eat ;
	
	public InhertanceTask() {;}
	public InhertanceTask(String work, String sleep, String eat) {
		this.work = work;
		this.sleep = sleep;
		this.eat = eat;
	}
	void workStart () {
		System.out.println("일한다.");
	}
		
	void sleepStart () {
		System.out.println("잠잔다.");
	}
	void eatStart() {
		System.out.println("밥먹는다.");
	}
	
}
//   PersonTask
//   이름, 나이, 주소, 핸드폰
//   각 메서드 출력
//   work 일을 한다
//   sleep 잠을 잔다
//   eat 세 끼를 먹는다
class PersonTask extends InhertanceTask {
	String name , address ;
	int age;
	int phoneNum;
	
	public PersonTask() {;}
	public PersonTask(String name, String address, int age, int phoneNum , String work, String sleep, String eat) {
		super(work, sleep, eat);
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNum = phoneNum;
	}
	@Override
	void workStart () {
		System.out.println("일을 한다.");
	}
	@Override
	void sleepStart () {
		System.out.println("잠을 잔다.");
	}
	@Override
	void eatStart() {
		System.out.println("세끼를 먹는다.");
	}
}

class StudentTask extends InhertanceTask {
	String intaId;
	
	public StudentTask() {;}
	public StudentTask(String intaId,String work, String sleep, String eat) {
		super(work, sleep, eat);
		this.intaId = intaId;
	}
	
	@Override
	void workStart() {
		System.out.println("아르바이트를 한다");
	}
	@Override
	void sleepStart () {
		System.out.println("수업 시간에 잠을 잔다");
	}
	@Override
	void eatStart() {
		System.out.println("아침을 거른다");
	}
}
//   StudentTask
//   인스타아이디
//   각 메서드 출력
//   work 아르바이트를 한다
//   sleep 수업 시간에 잠을 잔다
//   eat 아침을 거른다
//   
class EmployeeTask extends InhertanceTask {
	int emergencyCash;
	
	public EmployeeTask() {;}
	public EmployeeTask(int emergencyCash,String work, String sleep, String eat) {
		super(work, sleep, eat);
		this.emergencyCash = emergencyCash;
	}
	
	@Override
	void workStart() {
		System.out.println("하루 종일 일을 한다");
	}
	@Override
	void sleepStart () {
		System.out.println("잠을 설친다");
	}
	@Override
	void eatStart() {
		System.out.println("야식을 먹는다");
	}
}
//   EmployeeTask
//   비상금
//   각 메서드 출력
//   work 하루 종일 일을 한다
//   sleep 잠을 설친다
//   eat 야식을 먹는다
//   
//   InhertanceTask에서
//   사람, 학생, 직장인 객체화 후 각 메서드 출력하기

public class InheritanceTask {
   public static void main(String[] args) {
      PersonTask youngMan = new PersonTask("영민", "강남구", 20 , 76666677 , String work, String sleep, String eat);
   }
}
