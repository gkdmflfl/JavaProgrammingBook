package Chapter7;

public class InterfacePolyTest {
	/*
	 * 인터페이스 다형성 테스트
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommandProcess commandProcess = new CommandProcess();
		
		WriteCommand wc = new WriteCommand();
		ListCommand lc = new ListCommand();
		
		commandProcess.process(wc);
		commandProcess.process(lc);
	}

}
