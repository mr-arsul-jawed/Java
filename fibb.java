import java.util.*;
class fibb{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Fibbonacchi No. Have To Print : ");
		int n = sc.nextInt();
		int f1 = 0;
		int f2 = 1;
		System.out.println(n + " Fibbonacchi Numbers Are : ");
		for(int i = 0;i<n;i++){
			if(i == 0){
				System.out.print(f1);
			}
			else if(i == 1){
				System.out.print("\t" + f2);
			}
			else {
				int f3 = f1 + f2;
				System.out.print("\t" + f3);
				f1 = f2;
				f2 = f3;	
			}
		}
	}
}