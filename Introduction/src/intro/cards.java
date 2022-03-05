package intro;
import java.util.Random;
public class cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		
		for(i=0;i<1000;i++) {
			Random re = new Random();
	
			int num = re.nextInt((52 -1 )+1) + 1;
			if(num>=1 && num<=13) {
				 
				count1+=1;
				
			}
			else if(num>=14 && num<=26){
			 
				count2+=1;
				
			}
			else if(num>=27 && num<=39) {
				
				count3+=1;
				
			}
			else if(num>=40 && num<=52) {
				
				count4+=1;
			}
			else {
				break;
			}
		}
		System.out.println("Spade" +count1);
		System.out.println("club" +count2);
		System.out.println("diamond" +count3);
		System.out.println("heart " +count4);
		

	}

}
