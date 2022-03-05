package intro;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  //System.out.println("Enter The No of students");
	  //int noStu= sc.nextInt();
	  int subject;
	  int subMarks;
	  float totalmarks = 0;
	  float stuAverage = 0;
	  float marks;
	  int noSub;
	  float classAvg;
	  float Avg;
	  int count;
	  int subtotal;
	  int i;
	  System.out.println("Enter The No of students");
	  int n= sc.nextInt();
	  //System.out.println(n);
	  //for(count=0;count<n;++count) {
                
		  for(i=1;i<=n;i++) {
			  System.out.println("Enter Student name:"+i);
			  String name=sc.next();
			  System.out.println("Enter  test one marks of "+name);
			  int sub1 = sc.nextInt();
			  System.out.println("Enter   test two marks of "+name);
			  int sub2 = sc.nextInt();
			  System.out.println("Enter test three marks of "+name);
			  int sub3 = sc.nextInt();
			  System.out.println("Enter test four marks of "+name);
			  
			  int sub4 = sc.nextInt();
			  subtotal=sub1+sub2+sub3+sub4;
			  //stuAverage= subtotal/4;
			  
			  totalmarks= totalmarks + subtotal;
			  stuAverage= subtotal/4;
			  System.out.println("studen average"+name  + stuAverage);
			  //count+=1;
			  
		  }
		  
		  classAvg = totalmarks/(4*n);
		  System.out.println("class average"+classAvg);
		  
		  
	  //}


	  
	 			  
		  
	
		  
	 }
	 
	 
		
	}


