package Chapter5;

public class AirConUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCon airCon;						//AirCon Ŭ���� Ÿ���� airCon ���۷��� ������ ������ �κ��̴�. 
		airCon = new AirCon();				//new�����ڸ� ����ؼ� �޸𸮻� airCon ��ü�� ������ �κ��̴�.
		
		airCon.color = "White";
		airCon.temp = 10;
		airCon.price = 10000;
		
		airCon.tempUp();
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color
				+ ", airCon.price = " + airCon.price);
		airCon.powerOn();
		airCon.powerOff();
		airCon.tempDown();
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color
				+ ", airCon.price = " + airCon.price);
		
		/*====================================*/
		
		AirCon airCon2 = new AirCon();
		System.out.println("airCon2.temp = " + airCon2.temp + ", airCon2.color = " + airCon2.color
				+ ", airCon2.price = " + airCon2.price);
		
		//airCon2 ������ airCon1 ���� ���� �� �Ҵ�
		airCon2 = airCon;
		System.out.println("airCon2.temp = " + airCon2.temp + ", airCon2.color = " + airCon2.color
				+ ", airCon2.price = " + airCon2.price);
		
	}

}
