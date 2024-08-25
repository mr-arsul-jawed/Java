public class overloadConst {
    overloadConst(String n){
        System.out.printf("Parameterized Constructor Says \"%s\"",n);
    }
    overloadConst(){
        System.out.println("0 Argument Constructor");
    }
    public static void main(String[] args) {
        // uncomment and run(●'◡'●)
        // overloadConst obj1 = new overloadConst();
        // overloadConst obj2 = new overloadConst("Hello");
    }    
}
