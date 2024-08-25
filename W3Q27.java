import java.util.Scanner;

public class W3Q27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score \"0 - 100\" : ");
        int score = sc.nextInt();
        sc.close();
        if(score < 0 || score > 100){
            System.out.println("Enter Valid Score!");
        }
        else {
            Grader obj = new Grader(score);
            String Grade = obj.letterGrade();
            System.out.println("Grade : " + Grade);
        }
    }
}
class Grader {
    int score ;
    Grader(int n){
        this.score = n;
    }
    public String letterGrade(){
        if(score >= 95){
            return "O";
        }
        else if (score >= 90) {
            return "E";
        }
        else if (score >= 80) {
            return "A";
        }
        else if (score >= 70) {
            return "B";
        }
        else if (score >= 60) {
            return "C";
        }
        else{
            return "F";
        }
    }
}