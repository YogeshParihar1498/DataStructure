package recursion;

public class isSorted {
   public static boolean isStr(int[] arr, int idx) {
	   if(idx==arr.length-1) {
		   return true;
	   }
	   
	   
		   if(arr[idx]>=arr[idx+1]) {
	   
		   return false;}
	   
	     else {
		   
		   return isStr(arr,idx+1);
	   }
   }
	
	public static void maain(String [] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println(isStr(arr,0));
	}
}
