class Pattern1{
	public static void main(String[] args){
		int j = 1;
		for(int i=0;j<10;i =  i + 2){
			for(int k =0; j<10 && k<=i;j++,k++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}