package Chapter5;

public class SearchService {
	Member[] members = new Member[5];
	
	public SearchService() {
		members[0] = new Member("������", 176,77,"���ѹα�");
		members[1] = new Member("James", 187,67,"�̱�");
		members[2] = new Member("�����", 166,57,"�Ϻ�");
		members[3] = new Member("ȫ�ݺ�", 177,80,"�߱�");
		members[4] = new Member("���ֻ�", 199,78,"�ε�");
	}
	boolean searchMember(String name) {
		boolean searchResult = false;
		for(int i = 0;i<members.length;i++) {
			if(members[i].getName().equals(name)) {
				printInfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
	}
	private void printInfo(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member.getName() + "���� ã�� ���");
		System.out.println("�̸� : " + member.getName());
		System.out.println("���� : " + member.getHeight());
		System.out.println("������ : " + member.getWeight());
		System.out.println("���� : " + member.getNation());
	}
	
}
