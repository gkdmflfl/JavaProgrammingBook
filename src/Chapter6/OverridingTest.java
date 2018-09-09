package Chapter6;

class OverridingParent {
	void parentMethod() {
		System.out.println("parent Method");
	}
}

class OverridingChild extends OverridingParent {
	@Override
	void parentMethod() {
		System.out.println("overriding method by child");
	}
}

public class OverridingTest {
	/*
	 * Overriding Å×½ºÆ® 
	 */
	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();
	}
}
