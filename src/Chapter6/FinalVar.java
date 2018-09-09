package Chapter6;

class VarClass{
	final int x;
	static final int y = 100;
	public VarClass(int x) {
		// TODO Auto-generated constructor stub
		this.x = x;
	}
}

public class FinalVar {
	/*
	 * final 변수 사용 테스트
	 */
	public static void main(String[] args) {
		// VarClass.y = 30;.
		VarClass vc1 = new VarClass(10);
		//vc1.y = 50;
		//vc1.x = 40;		
		VarClass vc2 = new VarClass(20);
		//vc1.y = 70;
		//vc1.x = 80;
	}

}
