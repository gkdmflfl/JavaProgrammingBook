package Chapter5;

public class VariableKind {
	//�ν��Ͻ� ��� ����
	int memVar;
	//static ��� ����
	static int staticVar;

	public static void main(String[] args) {
		// ���� ����
		int localVar;
		
		VariableKind vk1 = new VariableKind();
		System.out.println("vk.memVar = " + vk1.memVar);
		System.out.println("vk.staticVar = " + vk1.staticVar);
		System.out.println("VariableKind.staticVar = " + VariableKind.staticVar);
		System.out.println("staticVar = " + staticVar);
		
		VariableKind vk2 = new VariableKind();
		vk1.staticVar = 20;
		System.out.println("vk2.staticVar = " + vk2.staticVar);
		//System.out.println("localVar = " + localVar);

	}

}
