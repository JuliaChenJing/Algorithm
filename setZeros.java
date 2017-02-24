public class SetZeros {

	public static int [] [] setZeros(int[][] matrix) {
		int[] row = new int[matrix.length];//不用建二维数组，独立建两个数组就行
		int[] column = new int[matrix[0].length];
		
		// Store the row and column index with value 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}

		// Set arr[i][j] to 0 if either row i or column j has a 0
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if ((row[i] == 1 || column[j] == 1)) {
					matrix[i][j] = 0;
				}
			}
		}
		
		return matrix;
	}

	public static void main(String[] args) {
		
		int [] []m={{1,2,3},{0,5,6}};

		int [] [] re=setZeros(m);
		
		for (int i = 0; i < re.length; i++) {
			for (int j = 0; j < re[0].length; j++) 
			{
				System.out.print(re[i][j]+" ");
			}
			System.out.println();
		}

	}
}

/*
0 2 3 
0 0 0 
 */
