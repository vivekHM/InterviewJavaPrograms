package Packages;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=11;
		int prime=0;
		
		for(int i=0;i<a/2;i++) {
			
			if(a%i==0) {
				System.out.println("Not a Prime Number");
				prime=1;
				break;
			}
		}
		
		System.out.println("Numbe is not a prime number");
	}

}
