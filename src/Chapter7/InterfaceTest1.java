package Chapter7;

interface Interface1 {
	int interVar = 10;
	void interface1Method();
}

class Interface1Impl implements Interface1 {

	@Override
	public void interface1Method() {
		// TODO Auto-generated method stub
		System.out.println("interface1Method 구현");
	}
	
}

public class InterfaceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interface1 in1 = new Interface1();				//인터페이스로는 객체 생성 불가
		Interface1Impl in1Impl = new Interface1Impl();
		System.out.println("in1Impl.interVar : " + in1Impl.interVar);
		System.out.println("Interface1.interVar : " + Interface1.interVar);
		in1Impl.interface1Method();
		
	}

}
