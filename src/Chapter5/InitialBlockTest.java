package Chapter5;

class Good{
	{
		System.out.println("good의 인스턴스 초기화 블록 실행");
	}
	static {
		System.out.println("good의 static 초기화 블록 실행");
	}
}

public class InitialBlockTest {

	/*
	 * Initial block test
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Good g1 = new Good();
		Good g2 = new Good();
		Good g3 = new Good();
		System.out.println("main");
		
	}

}
