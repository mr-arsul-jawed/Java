class overiding{
	public static void main(String[] args){
		Doctor obj1 = new Doctor();
		obj1.details();
		Surgion obj2 = new Surgion();
		obj2.details();
	}
}
public class Doctor{
	// add "final" keyword to prevent overiding
	public void details() {
		System.out.println("Doctor ID");
	}
}
public class Surgion extends Doctor{
	//write a "@Override"  notaition to indicate that here is overiding occuring its not need but recomended
	@Override public void details() {
		System.out.println("Surgion ID");
	}
}