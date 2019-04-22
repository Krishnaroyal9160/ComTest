import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number");
		int start = sc.nextInt();
		System.out.println("Enter ending number");
		int end = sc.nextInt();
		System.out.println("List of Prime Numbers between" + start + "and" + end);
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;	
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	

}
