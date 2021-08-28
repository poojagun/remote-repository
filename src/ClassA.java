import java.util.Scanner;

public class ClassA {
	public void fibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input=");
		int ip = sc.nextInt();
		System.out.println("Input is=" + ip);
		int ans[] = null;
		int a1 = 0, a2 = 1, a3;
		for (int i = 2; i < ip; i++) {
			a3 = a1 + a2;
			a1 = a2;
			a2 = a3;
			System.out.println("a3=" + a3);
		}
	}

	public void primenumber() {
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("input=");
		int ip = sc.nextInt();
		for (int i = 2; i < ip; i++) {
			for (int j = 2; j <= i; j++) {
				ans = i % j;
				if (ans == 0) {
					break;
				}
				System.out.print(i + " ");

			}
		}
	}

	public void palindrom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input=");
		String ip = sc.next();
		String str = "";
		for(int i=ip.length()-1;i>=0;i--) {
			str=str+ip.charAt(i);
			System.out.println(str);
			}
		
		
	}

	public void sorting() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input=");
		int ip[] = {3,5,7,2,23,6,4};
		System.out.println("Input is=" + ip);
		for(int i=0;i<ip.length;i++) {
			
			for(int j=i+1;j<=ip.length;j++) {
				if(ip[i]<ip[j]) {
					
				}
				
			}
		}
		
	}
	
}
