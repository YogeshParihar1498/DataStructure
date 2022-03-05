package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class kmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n = sc.nextInt();
         int k=3;
         int m=0;

	     int a []=new int[n];
	     for(int i=0;i<n;i++) {
	         a[i]=sc.nextInt();
	         
	    }
	     Arrays.sort(a);
	     System.out.println(a[k-1]);
	     
	}

}
