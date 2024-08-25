import java.util.Scanner;

public class selectionShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        char []newStr = str.toCharArray();
        sc.close();
        for(int i = 0;i<str.length();i++){
            for(int j = i+1;j<str.length();j++){
                if (newStr[i] > newStr[j]) {
                    char z = newStr[j];
                    newStr[j] = newStr[i];
                    newStr[i] = z;
                }
            }
        }
        System.out.println(newStr);
    }
    
}