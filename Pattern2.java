class Pattern2{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int j = 4; j>0;j--){
				if(j<=i){
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}	
			}
			for(int j = 2; j<=4;j++){
				if(j<=i){
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}