package intro;

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print("    ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
