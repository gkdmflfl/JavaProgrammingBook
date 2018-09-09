package Test2;

import Test1.ProtectedData;

public class ProtectedAccess2 extends ProtectedData{			//ProtectedAccess2가 ProtectedData를 상속받아 자식클래스가 되었다
	void printVar() {
		System.out.println("protectedVar = " + protectedVar); 	//따라서 접근 가능
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccess2 pa = new ProtectedAccess2();
		pa.printVar();
	}

}
