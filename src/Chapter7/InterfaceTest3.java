package Chapter7;

interface In1 {
	int x = 10;
	void in1Method();
}

interface In2 {
	int x = 20;
	void in1Method();
	void in2Method();
}

interface In3 extends In1, In2 {
	
}

class ExtendsTest implements In3 {
	@Override
	public void in1Method() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void in2Method() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsTest extendsTest = new ExtendsTest();
		
		extendsTest.in1Method();
		extendsTest.in2Method();
		
		System.out.println(In1.x);
		System.out.println(In2.x);
	}

}
