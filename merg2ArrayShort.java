import java.util.Scanner;
class merg2ArrayShort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array 1 : ");
		int n = sc.nextInt();
		int []array1 = new int[n];
		System.out.printf("Enter %d Elements Of Array 1 : ",n);
		for(int i = 0; i < n; i++){
			array1[i]=sc.nextInt();
		}
		System.out.println("Enter Size Of Array 2 : ");
		int m = sc.nextInt();
		int []array2 = new int[m];
		System.out.printf("Enter %d Elements Of Array 2 : ",m);
		for(int i = 0; i < m; i++){
			array2[i]=sc.nextInt();
		}
		sc.close();
		int size = n + m;
		int []array3 = new int[size];
		for(int i=0,j=0,k=0; i < size; i++){
			if(j==n){
				array3[i] = array2[k];
				k++;
				continue;
			}
			if(k==m){
				array3[i] = array1[j];
				j++;
				continue;
			}
			if(array1[j] < array2[k]){
				array3[i] = array1[j];
				j++;
			}
			else{
				array3[i] = array2[k];
				k++;
			}
		}
		System.out.println("Sorted Merged Array :");
		for(int j = 0; j < size; j++){
			System.out.print(array3[j] + "\t");
		}
		
	}
}
