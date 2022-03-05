package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class nosort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n = sc.nextInt();
        
         int count1=0;
         int count2=0;
         int count3=0;
         
         
	     int a []=new int[n];
	     for(int i=0;i<n;i++) {
	         a[i]=sc.nextInt();
	         
	    }
	     for(int i=0;i<n;i++) {
	    	 if(a[i]==0) {
	    		 count1++;
	    		 
	    	 }
	    	 else if(a[i]==1) {
	    		 count2++;
	    		 
	    	 }
	    	 else if(a[i]==2) {
	    		 count3++;
	    	 }
	     }
	     int i = 0;
         while(i<count1) {
        	 a[i]=0;
        	 i=i+1;
        	 count1--;
        	 
         }
         while(i<count2) {
        	 a[i]=1;
        	 i=i+1;
        	 count2--;
        	 
         }
         while(i<count3) {
        	 a[i]=2;
        	 i=i+1;
        	 count3--;
        	 
         }
         
         
         
         
         
         
	     System.out.println(Arrays.toString(a));
	}

}
