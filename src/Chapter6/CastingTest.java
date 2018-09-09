package Chapter6;

public class CastingTest {
	/*
	 * Casting 테스트	
	 */
	public static void main(String[] args) {
		
		President president1 = new President();
		
		//president1객체를 상위 클래스인 Person 클래스 레퍼런스 변수에 참조시킴
		//president 객체가 자동으로 Person 타입으로 UpCasting 되면서 참조됨
		Person person1 = president1;
		
		//person1 레페러스 변수의 참조 값을 President 타입의 레퍼런스 변수에 할당함
		//부모 클래스 타입의 참조 값을 자식 클래스 타입의 참조 변수에 할당하므로 명시적 캐스팅
		President president2 = (President)person1;
		
		//Person 객체 생성
		Person person2 = new Person();
		//Person person2 = new President();			//이걸 대신 써주면 캐스팅 예외 안뜸
		
		//Person 객체를 President 타입의 레퍼런스 변수에 참조시킴
		try {
			President president3 = (President)person2;			//컴파일 오류는 발생하지 않지만 런타임시 오류 발생
		}catch(Exception e){
			System.out.println("자식 클래스의 레퍼런스 변수가 부모 클래스 타입의 객체를 참조할 수 없다.");
			e.printStackTrace();								//ClassCastException
		}
		//같은 부모 클래스를 상속받는 클래스 타입끼리 캐스팅
		//Student student = (Student)president2;
	}

}
