package Chapter5;

import java.util.Scanner;

public class SearchMain {

	/*
	 * �̸����� �˻� ����
	 */
	public static void main(String[] args) {
		SearchService sv = new SearchService();
		Scanner scanner = new Scanner(System.in);

		
		do {
			System.out.println("�˻��� ȸ�� �̸��� �Է��ϼ���.");
			String name = scanner.nextLine();
			boolean searchResult = sv.searchMember(name);
			if(searchResult) break;
			System.out.println("�ش� ȸ���� �����ϴ�.");
		} while(true);
	}

}
