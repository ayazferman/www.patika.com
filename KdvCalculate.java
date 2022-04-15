import java.util.Scanner;

public class KdvCalculate {
	private static Scanner sc;


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		double fee, kdvAmount, feeSum;
		System.out.println("Welcome to KDV calculate program!!");
		System.out.println("Please enter fee amount: ");
		fee=sc.nextDouble();
		
		if(fee<=1000 && fee>0) {
			kdvAmount=fee*0.18;
			feeSum=fee+kdvAmount;
			System.out.println("KDV ratio: %18");
			System.out.println("The fee deposited: " + fee);
			System.out.println("KDV amount: " + kdvAmount);
			System.out.println("Fee amount with KDV: " + feeSum);
			
		}else if(fee>1000) {	
			kdvAmount=fee*0.08;
			feeSum=fee+kdvAmount;
			System.out.println("KDV ratio: %8");
			System.out.println("Amount without KDV: " + fee);
			System.out.println("KDV amount: " + kdvAmount);
			System.out.println("Fee amount with KDV: " + feeSum);
			
		}else {
			System.out.println("You entered an invalid number!!");
		}
	}
}
