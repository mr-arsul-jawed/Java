import java.util.Scanner;
class matrixMulti{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Row And Column : ");
		int row = sc.nextInt();
		int col = row;
		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		int[][] multi = new int[row][col];
		System.out.println("Enter First Matrix : ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				matrix1[i][j]  = sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix : ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter First Matrix : ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				multi[i][j] = 0;
				for(int k=0; k<col; k++){
					multi[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
			
		}
		System.out.println("Product : ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(multi[i][j] + "\t");
			}
			System.out.println();
		}
	}
}