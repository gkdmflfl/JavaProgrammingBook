package Test2;

import Test1.ProtectedData;

public class ProtectedAccess2 extends ProtectedData{			//ProtectedAccess2�� ProtectedData�� ��ӹ޾� �ڽ�Ŭ������ �Ǿ���
	void printVar() {
		System.out.println("protectedVar = " + protectedVar); 	//���� ���� ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedAccess2 pa = new ProtectedAccess2();
		pa.printVar();
	}

}
