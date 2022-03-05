package recursion;

public class Permutation {
    public static void printPer(String str,String permu) {
    	if(str.length()==0) {
    		System.out.println(permu);
    		return;
    	}
    	for(int i=0;i<str.length();i++) {
    		char currChar=str.charAt(i);
    		String newStr = str.substring(0,i)+str.substring(i+1);
    		printPer(newStr,permu+currChar);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String str="abc";
             printPer(str,"");
	}

}
