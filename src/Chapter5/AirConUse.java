package Chapter5;

public class AirConUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCon airCon;						//AirCon 클래스 타입인 airCon 레퍼런스 변수를 선언한 부분이다. 
		airCon = new AirCon();				//new연산자를 사용해서 메모리상에 airCon 객체를 생성한 부분이다.
		
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

	}

}
