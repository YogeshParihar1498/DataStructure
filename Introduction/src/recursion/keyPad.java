package recursion;

public class keyPad {
      public static String[] map= {".","abc","def","ghi","jkl","mno","pqrs","tu","mno","pqrs","tu","vwx","yz"};
      public static void combo(String str, int idx,String Combination) {
    	  if(idx==str.length()) {
    		  System.out.println(Combination);
    		  return;
    	  }
    	  char currChar=str.charAt(idx);
    	  String mapping= map[currChar- '0'];
    	  for(int i=0;i<mapping.length();i++) {
    		  
    		  combo(str,idx+1,Combination+mapping.charAt(i));
    	  }
      }
	public static void main(String[] args) {
		 String str="23";
		 combo(str,0,"");

	}

}
