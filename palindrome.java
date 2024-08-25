import java.util.Scanner;
class palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String : ");
		String str = sc.next();
		int length = str.length();
		int flag = 0;
		for(int i = 0;i<length / 2 ;i++){
			if(str.charAt(i) != str.charAt(length - i - 1)){
				flag++;
			}
		}
		if(flag == 0){
			System.out.print(str + " Is Palindrome");
		}
		else {
			System.out.print(str + " Is Not Palindrome");
		}
	}
}