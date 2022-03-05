package intro;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int temp=n;
    	int reverse=0;
    	while(temp>0) {
    		int var=temp%10;
    		temp/=10;
    		reverse=reverse*10+var;
    	}
    		
    	
    	if(reverse==n) {
    		System.out.println("palin");
    	}
    	else {
    		System.out.println("not");
    	}
    
}
}
