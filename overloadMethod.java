public class overloadMethod {
    public static void sum(int a, int b){
        int c= a + b;
        System.out.println("Sum Of Int = " + c);
    }
    public static void sum(double a, double b){
        double c= a + b;
        System.out.println("Sum Of Double = " + c);
    }
    public static void main(String[] args) {
        sum(2, 3);
        sum(3.2, 3.4);
    }
}
