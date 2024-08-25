import java.util.Scanner;
public class W4Q5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length Breadth Hieght Of Box :");
		int l = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		Box box = new Box(l ,b, h);
		
		System.out.println("Enter Size Of Side Of Cube :");
		int a = sc.nextInt();
		Cube cube = new Cube(a);
		
		System.out.println("Enter Radius Hieght Of Cylinder :");
		int r = sc.nextInt();
		l = sc.nextInt();
		Cylinder cylinder = new Cylinder(r,l);
		
		System.out.println("Enter Radius Hieght Of Cone :");
		r = sc.nextInt();
		l = sc.nextInt();
		Cone cone = new Cone(r,l);
		
		sc.close();
	}
}
public class ThreeDObject{
	public void wholeSurface(){}
	public void volume(){}
}
public class Box extends ThreeDObject {
	int l,b,h;
	public void wholeSurface(){
		double x = 2*(l*b + b*h+ l*h);
		System.out.println("Whole Surface Of Box : "+ x );
	}
	public void volume(){
		double x = l*b*h ;
		System.out.println("Volume Of Box : "+ x );
	}
	Box(int a, int d, int c){
		l = a;
		b = d;
		h = c;
		wholeSurface();
		volume();
	}
}
public class Cube extends ThreeDObject{
	int a;
	public void wholeSurface(){
		double x = 6*(a*a);
		System.out.println("Whole Surface Of Cube : "+ x );
	}
	public void volume(){
		double x = a*a*a;
		System.out.println("Volume Of Cube : "+ x );
	}
	Cube(int x){
		a = x;
		wholeSurface();
		volume();
	}
	
}
public class Cylinder extends ThreeDObject{
    int r;
	int l;
	public void wholeSurface(){
		double x = 2*3.14*r*(r+l);
		System.out.println("Whole Surface Of Cylinder : "+ x );
	}
	public void volume(){
		double x = 3.14*r*r*l ;
		System.out.println("Volume Of Cylinder : "+ x );
	}
	Cylinder(int a, int b){
		r = a;
		l = b;
		wholeSurface();
		volume();
	}
}
public class Cone extends ThreeDObject{
	int r;
	int l;
	public void wholeSurface(){
		double x = 3.14*r*(r+l);
		System.out.println("Whole Surface Of Cone : "+ x );
	}
	public void volume(){
		double x = 3.14*r*r*l/3;
		System.out.println("Volume Of Cone : "+ x ) ;
	}
	Cone(int a, int b){
		r = a;
		l = b;
		wholeSurface();
		volume();
	}
}