package Chapter7;

public class InterfacePolyTest {
	/*
	 * �������̽� ������ �׽�Ʈ
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
