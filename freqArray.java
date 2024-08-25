import java.util.Scanner;
class freqArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int n = sc.nextInt();
		int []array = new int[n];
		System.out.printf("Enter %d Positive Elements : ",n);
		for(int i = 0; i < n; i++){
			array[i]=sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			int z = array[i];
			if(array[i]== -1){
				continue;
			}
			int count = 0;
			for(int j = 0; j < n; j++){
				if(z == array[j]){
					count++;
					array[j] = -1;
				}
			}
			System.out.printf("Element %d Frequency = %d \n",z,count);
		}
		
	}
}