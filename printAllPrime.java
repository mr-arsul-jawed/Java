import java.util.Scanner;
class printAllPrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lower Range To Print Prime Number : ");
		int low = sc.nextInt();
		System.out.println("Enter Higher Range To Print Prime Number : ");
		int high = sc.nextInt();
		for(int j = low;j < high ;j++){
			int flag = 0;
			for(int i = 2;i<= j / 2 ;i++){
				if(j % i == 0 ){
					flag++;
				}
				if(flag != 0 ){
					break;
				}
			}
			if(flag == 0){
				System.out.print(j + "\t");
			}
		}
	}
}