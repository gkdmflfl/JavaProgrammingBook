package Chapter6;

public class ChildMethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Student();
		//person.study();						//Person에는 없고 Student에만 정의된 메소드라 컴파일 오류 발생
	}

}
