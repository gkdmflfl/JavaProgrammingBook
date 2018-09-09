package Chapter7;

abstract class AbstractClass{
	int age;
	
	void generalMethod() {
		System.out.println("일반 메소드");
	}
	
	abstract void abstractMethod();
}

class AbstractChildClass extends AbstractClass{

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("추상 메소드 구현");
		
	}	
	
}
public class AbstractTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상 클래스로 객체 생성
		//AbstractClass ac = new AbstractClass();
		
		//자식 클래스로 객체 생성
		AbstractChildClass acc = new AbstractChildClass();
		acc.abstractMethod();
		System.out.println(acc.age);
		acc.generalMethod();
	}

}
