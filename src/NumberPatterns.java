
public class NumberPatterns {
	public void pattern1(int n) {
		int count=0;
		for (int i = 1; i <= n; i++) {			
			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
	
	
		public void pattern2(int n) {
			for (int i = 1; i <= n; i++) {			
				for (int j = 1; j <= i; j++) {
					System.out.print(j+" ");
				}
				for (int k = 2; k <= i; k++) {
					System.out.print(k-1+" ");
				}
				System.out.println();
			}
		}
	
	public static void main(String[] args) {
		NumberPatterns a =new NumberPatterns();
		//a.pattern1(5);
		a.pattern2(5);
	}

}
