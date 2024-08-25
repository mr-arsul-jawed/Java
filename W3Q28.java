import java.util.Scanner;

public class W3Q28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales : ");
        int sales = sc.nextInt();
        sc.close();
        if(sales < 0){
            System.out.println("Enter Valid sales!");
        }
        else {
            Commission obj = new Commission(sales);
            double z = obj.commisiion();
            System.out.println("Commission 10% : " + z);
        }
    }
}
class Commission {
    int sales ;
    Commission(int n){
        this.sales = n;
    }
    public double commisiion(){
        double com = (double) sales * 10 / 100;
        return com;
    }
}