import java.util.Scanner;

public class strShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        char []newStr = str.toCharArray();
        sc.close();
        for(int i = 0;i<str.length();i++){
            for(int j = 1;j<str.length()-i;j++){
                if (newStr[j-1] > newStr[j]) {
                    char z = newStr[j-1];
                    newStr[j-1] = newStr[j];
                    newStr[j] = z;
                }
            }
        }
        System.out.println(newStr);
    }
}
