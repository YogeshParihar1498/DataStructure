package arrays;

public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[5][3];
		int b[][]=  {{1,2,3,4},{3,4,5},{5,6,7}};
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.println(b[i][j]);
			}
		}

	}

}
