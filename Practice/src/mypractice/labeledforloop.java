package mypractice;

public class labeledforloop {

	public static void main(String[] args) {
		
		outer:
			for(int i=1; i<=3; i++) {
				System.out.println(i);
				
				for(int j=0; j<=2; j++) {
					System.out.println("Kodnest");
					if(j==0);
					break outer;
				}
			}
	}

}
