package Chapter5;

class Good{
	{
		System.out.println("good�� �ν��Ͻ� �ʱ�ȭ ��� ����");
	}
	static {
		System.out.println("good�� static �ʱ�ȭ ��� ����");
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
