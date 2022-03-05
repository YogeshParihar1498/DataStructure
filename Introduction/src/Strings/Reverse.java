package Strings;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String s []="I am Yogi".split(" ");
		
		String ans="";
		for(int i=s.length-1;i>=0;i--) {
			ans+=s[i]+" ";
			
		}
		System.out.println(ans);

	}

}
