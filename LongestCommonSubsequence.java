public class LCS {


	 private static int[] lookUp;
	 public static  int countRecursive=0;
	 public static  int countMemoized=0;
	 
	public static void main(String [] args)
	{
	
		String A="abcde";
		String B="abcd";
		 lookUp = new int[Math.max(A.length(),B.length())];        // create and initialize array
	       for (int i=0; i<Math.max(A.length(),B.length()); i++)        
	    	      lookUp[i] =Integer.MAX_VALUE;
		System.out.println(longestCommonSubsequence(A,B));
	}
		
	
	 /**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public static int longestCommonSubsequence(String A, String B) {
        int n = A.length();
	    int m = B.length();
        int f[][] = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
               /* f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
                if(A.charAt(i - 1) == B.charAt(j - 1))
                    f[i][j] = f[i - 1][j - 1] + 1;*/
            	helper(A,B,i,j,f);
            }
        }
        return f[n][m];
    }
    
    public static int [][] helper(String A,String B, int i,int j, int [] [] f)
    {
    	  f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
          if(A.charAt(i - 1) == B.charAt(j - 1))
              f[i][j] = f[i - 1][j - 1] + 1;
    	return f;
    }
}

