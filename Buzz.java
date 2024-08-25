import java.util.*;
public class Buzz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		int n = sc.nextInt();
		sc.close();
		if(n%10==7){
			System.out.println( n + " Is Buzz Number");
		}
		else if(n%7==0){
			System.out.println( n + " Is Buzz Number");
		}
		else {
			System.out.println( n + " Is Not Buzz Number");
		}
		
	}
}