
public class Patterns {

	public void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void pattern2(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void pattern3(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void pattern4(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = n; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int k = 2; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void pattern6(int n) {
		for (int i = 0; i <= n; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void pattern7(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Patterns obj = new Patterns();
		// obj.pattern1(5);
		// obj.pattern2(5);
		// obj.pattern3(5);
		// obj.pattern4(5);
		//obj.pattern5(5);
		//obj.pattern6(5);
		obj.pattern7(5);
	}

}
