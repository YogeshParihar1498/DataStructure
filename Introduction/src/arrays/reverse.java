package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n = sc.nextInt();
	     

	     int a []=new int[n];
	     int j=(a.length);
	     for(int i=0;i<n;i++) {
	         a[i]=sc.nextInt();}
	     
	       
	     
	     System.out.println("original array is");
	     System.out.println(Arrays.toString(a));
	     
	     int b[]=new int[j];
	     for(int i=0;i<j;i++) {
	    	 b[i]=a[n-1];
	    	 n--;
	     }
	     System.out.println("reverse  array is");
	     System.out.println(Arrays.toString(b));
	     
	     
	     
        
	     
	                  
         
	            
	     

	}
	     
	}

