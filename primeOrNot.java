import java.util.Scanner;
class primeOrNot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int str = sc.nextInt();
		int flag = 0;
		for(int i = 2;i<= str / 2 ;i++){
			if(str % i == 0 ){
				flag++;
			}
			if(flag != 0 ){
				break;
			}
		}
		if(flag == 0){
			System.out.print(str + " Is Prime");
		}
		else {
			System.out.print(str + " Is Not Prime");
		}
	}
}