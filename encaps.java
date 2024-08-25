class encaps{
	public static void main(String[] args){
		Print.sout();
		// Print.print();
	}
}
class Print{
	private static void print(){	
		System.out.print("Hi");
	}
	public static void sout(){	
		Print.print();
	}
}