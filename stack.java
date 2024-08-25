import java.util.*;
public class stack{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    ArrayList<Integer> stack = new ArrayList<Integer>();
	    int top = 0;
	    for(int i=0;i==0;){
	        System.out.println("Peek Stack =" + stack);
	        System.out.print("Enter push = Push, pop = Pop, ex = Exit, Top = " + top + " :");
	        String op = sc.next();
	        switch(op){
        	    case "push" : {
        	        System.out.print("Enter Element To Push, Top = " + top + " :");
        	        int n = sc.nextInt();
        	        stack.add(n);
        	        top++;
        	        break;
        	    }
        	    case "pop" : {
        	        top--;
					if(top == -1){
						System.out.println("Stack Under Flow!");
						top++;
						break;
					}
        	        stack.remove(top);
        	        break;
        	    }
        	    case "ex": {
					i++;
        	        break;
        	    }
        	    default:{
        	        System.out.println("Choose Valid Option!");
					break;
        	    }
	        }
	    }
	}
}
