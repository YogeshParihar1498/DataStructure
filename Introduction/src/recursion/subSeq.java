package recursion;

import java.util.HashSet;

public class subSeq {
  public static void subseq(String str,int idx,String newString,HashSet <String> set) {
	  if(idx==str.length()) {
		if(set.contains(newString)) {
			return;
		}
		else {
			System.out.println(newString);
			set.add(newString);
			return;
		}
	  }
	  char currChar=str.charAt(idx);
	  
	  subseq(str,idx+1,newString+currChar,set);
	  subseq(str,idx+1,newString,set);
			  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaa";
		HashSet <String> set= new HashSet<>();
		subseq(str,0,"",set);

	}

}
