package exercises.week12.exercise;

public class LoanTest {

	public static void main(String[] args) {
		Loan loan=new Loan(100000, 0.0083, 12);
		
		System.out.println(loan);
		for (int i = 1; i <= loan.getLoanTerm(); i++) {
			loan.printMontlyPaymentDetailFor(i);	
		}
		
//		loan.printMontlyPaymentDetailFor(2);
//		loan.printMontlyPaymentDetailFor(12);
//		for (MonthlyPaymentDetail d : loan.getDetails()) {
//			System.out.println(d);
//		}
	}

}
