class overiding{
	public static void main(String[] args){
		Doctor obj1 = new Doctor();
		obj1.details();
		Doctor obj2 = new Surgion();
		obj2.details();
	}
}
public class Doctor{
	public static void details() {
		System.out.println("Doctor ID");
	}
}
public class Surgion extends Doctor{
	public static void details() {
		System.out.println("Surgion ID");
	}
}