package arrays;

import java.util.Scanner;

public class BubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//       int a[]=new int[n];
//       for(int i=0;i<a.length;i++) {
//    	    a[i]=sc.nextInt();
//    	    
//       }
		int a[]= {0,5,4,3,2,1};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			boolean sorted=true;
			  for(int j=0;j<n-1-i;j++) {
				  if(a[j+1]<a[j]) {
					  int temp=a[j+1];
					  a[j+1]=a[j];
					  a[j]=temp;
					  sorted=false;
				  }
				  
			  }
			  if(sorted) break;
			
		}
		for(int item:a) {
			System.out.print(item);
		}
        
	}

}
