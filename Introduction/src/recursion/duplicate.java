package recursion;

public class duplicate {
    public static boolean[] arr=new boolean[26];
    public static void removeDuplicate(String str,int indx, String newString) {
    	if(indx == str.length()) {
    		System.out.println(newString);
    		return;
    	}
    	char currChar=str.charAt(indx);
    	if(arr[currChar - 'a']) {
    		removeDuplicate(str,indx+1,newString);
    	}
    	else {
    		newString += currChar;
    		arr[currChar - 'a']=true;
    		removeDuplicate(str,indx+1,newString);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="abbccda";
       removeDuplicate(str,0,"");
	}

}
