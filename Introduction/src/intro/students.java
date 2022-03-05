package intro;

import java.util.Scanner;

public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int total=0;
		int n=2;
		int sub=3;
		for(int i=0;i<n;i++) {
			System.out.println("Enter name of stu"+ i+1);
			total=0;
			 
			 
			 for(int j=0;j<sub;j++) {
				 System.out.println("Enter marks of subject"+ j+1);
				 int a= sc.nextInt();
				  
				  total = total +a;
				  
				  
				 
			 }
			 float average = total/sub;
			  System.out.println("avregae of "+ average);
			  
			 

	}
		float classavg= total/(n*sub);
		System.out.println(classavg);

}
}
