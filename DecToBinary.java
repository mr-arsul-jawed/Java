import java.util.Scanner;
public class DecToBinary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Number : ");
		int n = sc.nextInt();
		sc.close();
		int bit,z=n;
		for(bit=0;z>0;bit++){
			z = z/2;
		}
		if(bit == 0){
			bit++;
		}
		int binary[] = new int[bit];
		System.out.println("Decimal = " + n);	
		for(int i = bit-1 ; i>=0 ; i--){
			if(n==1){
				binary[i] = 1;
				break;
			}
			else if(n==0){
				binary[i] = 0;
				break;
			}
			else if(n%2==0){
				binary[i] = 0;
			}
			else if(n%2 == 1){
				binary[i] = 1;
			}
			n = n / 2;	
		}
		System.out.print("Binary = ");
		for(int i = 0; i<bit ; i++){
			System.out.print(binary[i]);
		}
	}
}