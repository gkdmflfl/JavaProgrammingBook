package Chapter6;

public class InstanceOfTest {

	/*
	 * instanceof 연산자 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		President president1 = new President();
		
		//UpCasting
		//Person person1 = new President();랑 같음
		Person person1 = president1;
		
		if(person1 instanceof President) {
			President president2 = (President)person1;		//자손 <- 조상	DownCasting
			System.out.println("person1을 President 타입으로 캐스팅 성공");
		}
		else {
			System.out.println("person1을 캐스팅 할 수 없다");
		}
		//Person 객체 생성
		Person person2 = new Person();
		
		//Person 객체를 President 타입의 레퍼런스 변수에 참조시킴
		if(person2 instanceof President) {
			President president3 = (President)person2;
			System.out.println("person2를 President 타입으로 캐스팅 성공");
		}
		else {
			System.out.println("person2를 캐스팅 할 수 없다.");			
		}
		
		
		
	}

}
