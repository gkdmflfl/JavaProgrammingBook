package Chapter5;

public class ArgsTest {
	
	static class Args {
		/*public Args() {
			System.out.println(" --- Args() Constructor --- ");
		}*/
		
		int x;
		void add(int x) {
			x = x + 50;
		}
		
		void add(Args arg) {
			arg.x = arg.x + 40;
			System.out.println("40 ¥ı«ÿ¡¸");
		}
		
		void addNew(Args arg) {
			arg = new Args();
		}
		
		void add(int[] arr) {
			arr[0]++;
		}
	}
	
	public static void main(String[] args) {
		Args arg = new Args();
		arg.x = 100;
		int[] arr = new int[1];
		
		arg.add(arg.x);
		System.out.println("arg.x : " + arg.x);
		
		arg.add(arg);
		System.out.println("arg.x : " + arg.x);
		
		arg.addNew(arg);
		System.out.println("arg.x : " + arg.x);
		
		System.out.println("arr[0] : " + arr[0]);
		arg.add(arr);
		System.out.println("arr[0] : " + arr[0]);
		

	}

}
