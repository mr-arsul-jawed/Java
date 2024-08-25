class inherit{
	public static void main(String[] args){
		Surgion obj = new Surgion();
		obj.doctor_details();
		obj.surgion_details();
	}
}
public class Doctor{
	public static void doctor_details() {
		System.out.println("Doctor ID");
	}
}
public class Surgion extends Doctor{
	public static void surgion_details() {
		System.out.println("Surgion ID");
	}
}