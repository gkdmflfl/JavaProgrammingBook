package Chapter5;

public class VariableArgument {
	
	/*
	*Variable Argument Test
	*/
	
	void printInfo(String ...infos){
		if(infos.length != 0) {
			for(int i = 0; i < infos.length; i++){
				System.out.println(infos[i]);
			}
		}
		else
			System.out.println("���ڰ� ���׿�.");
	}

	public static void main(String[] args) {
		VariableArgument vt = new VariableArgument();
		System.out.println("���ھ���");
		vt.printInfo();
		System.out.println("���� �ϳ�");
		vt.printInfo("������");
		System.out.println("���� �� ��");
		vt.printInfo("������", "�����");
		System.out.println("���� �� ��");
		vt.printInfo("������", "�����", "1��");
		
	}

}
