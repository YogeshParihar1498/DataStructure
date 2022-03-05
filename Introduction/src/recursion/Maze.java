package recursion;

public class Maze {
    public static int printpath(int i,int  j, int m,int n) {
    	if(i==m || j==n ) {
    		return 0;
    		
    	}
    	if(i==m-1&& j==n-1) {
    		return 1;
    		
    	}
    	int Down=printpath(i+1,j,m,n);
    	int Up=printpath(i,j+1,m,n);
    	
    	return Down+Up ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3; int m=3;
		int totalpath=printpath(0,0,m,n);
		System.out.println(totalpath);

	}

}
