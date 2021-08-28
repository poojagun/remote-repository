import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number=" + input.nextInt());
		int a=input.nextInt();
		String num = String(input.nextInt());
		System.out.println("pooja");
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i)==3) {
				a=a-1;
				System.out.println("A="+a);
			}
		}

	}

	private static String String(int nextInt) {
		// TODO Auto-generated method stub
		return null;
	}

}
