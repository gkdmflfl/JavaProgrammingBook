package Chapter7;

class Vehicle1 {
	void move() {
		System.out.println("움직인다.");
	}
}

interface Flyable {
	void fly();
}

class Interface2Impl extends Vehicle1 implements Flyable {
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("난다.");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2Impl in2Impl = new Interface2Impl();
		in2Impl.fly();
		in2Impl.move();
	}

}
