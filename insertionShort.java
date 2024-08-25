import java.util.Scanner;

public class insertionShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        char []newStr = str.toCharArray();
        sc.close();
        for(int i = 1;i<=str.length();i++){
            char key = newStr[i-1];
            for(int j = i;j>0;j--){
                if (newStr[j-1] > key) {
                    newStr[j] = newStr[j-1];
                    newStr[j-1] = key;
                }
            }
        }
        System.out.println(newStr);
    }
}
