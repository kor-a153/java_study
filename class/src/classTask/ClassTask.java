package classTask;

// 스포츠(Sports) 추상화
// 농구(BasketBall), 야구(BaseBall), 축구(Soccer) 객체화
	//인원,시간,공
class Sports {
	int people;
	int time;
	String ball;
	
//기본생성자
public Sports() {;}

// 초기화 생성자 // shift alt s 
public Sports(int people, int time, String ball) {
	this.people = people;
	this.time = time;
	this.ball = ball;
	}
}

// 객체화 -> 기본생성자, 초기화생성자
public class ClassTask {
	public static void main(String[] args) {
		Sports BasketBall = new Sports(6, 30 , "basketBall");
		System.out.println(BasketBall.people);
		System.out.println(BasketBall.time + "분");
		System.out.println(BasketBall.ball);
		
		Sports BaseBall = new Sports(9, 300 , "baseBall");
		System.out.println(BaseBall.people);
		System.out.println(BaseBall.time + "분");
		System.out.println(BaseBall.ball);
		
		Sports Soccer = new Sports(11, 90 , "SoccerBall");
		System.out.println(Soccer.people);
		System.out.println(Soccer.time + "분");
		System.out.println(Soccer.ball);
		
}
}
