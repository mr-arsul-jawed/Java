import java.util.*;
class fibbRecur{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Fibbonacchi No. Have To Print : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){	
			int fib = fibb(i);
			System.out.print(fib + "\t");
		}
		
	}
	public static int fibb(int n){
		if (n==0){
			return 0;
		}
		if(n==1 || n==2){
			return 1;
		}
		int f3 = fibb(n-1) + fibb(n-2);
		return f3;
	}
}