package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
		int temp=0;
		
		for(int i=0;i<n/2;i++) {
		   
			temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
			
			n--;
		}
		System.out.println(Arrays.toString(a));
		
		

	}

}
