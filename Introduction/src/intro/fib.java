package intro;

public class fib {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.print(a +" "+b);
		int c;
		int n=5;
		for(int i=2;i<n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		

	}

}
