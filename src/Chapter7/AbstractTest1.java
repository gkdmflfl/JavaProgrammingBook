package Chapter7;

abstract class AbstractClass{
	int age;
	
	void generalMethod() {
		System.out.println("�Ϲ� �޼ҵ�");
	}
	
	abstract void abstractMethod();
}

class AbstractChildClass extends AbstractClass{

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("�߻� �޼ҵ� ����");
		
	}	
	
}
public class AbstractTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�߻� Ŭ������ ��ü ����
		//AbstractClass ac = new AbstractClass();
		
		//�ڽ� Ŭ������ ��ü ����
		AbstractChildClass acc = new AbstractChildClass();
		acc.abstractMethod();
		System.out.println(acc.age);
		acc.generalMethod();
	}

}
