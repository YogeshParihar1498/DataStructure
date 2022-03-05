package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n = sc.nextInt();
	     int min=0;
	     int max=0;
	     

	     int a []=new int[n];
	     for(int i=0;i<n;i++) {
	         a[i]=sc.nextInt();
	         
	    }
	     System.out.println(Arrays.toString(a));
	     if(n==1) {
	    	 min=a[0];
	    	 max=a[0];
	    	 System.out.println(min+ " " + max);
	     }
	     else {
	     
	   
		  if(a[0]<a[1]) {
			  min=a[0];
			  max=a[1];
			
			  			}
		  
		  else {
			  min=a[1];
			  max=a[0];
			  		  
		  
		  
		  
	  
	  
   
}
		  for(int i=2;i<n;i++) {
			  if(a[i]<min) {
				  min=a[i];
			  }
			  else if(a[i]>max) {
				  max=a[i];
			  }
			  
			  
		  }
		  System.out.println(min+ " " + max);
	     }
}
}
