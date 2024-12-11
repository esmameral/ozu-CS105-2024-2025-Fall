package exercises.week12.exercise;

import java.util.ArrayList;
import java.util.List;

public class Loan {
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double monthlyPayment;
	private List<MonthlyPaymentDetails> details=new ArrayList<MonthlyPaymentDetails>();
	
	public Loan(double loanAmount, double interestRate, int loanTerm) {
		super();
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanTerm = loanTerm;
		calculateMonthlyPayment(loanAmount, interestRate, loanTerm);
		calculateDetails();
	}

	private void calculateDetails() {
		double tmpLoan=loanAmount;
		for (int i = 0; i < loanTerm; i++) {
			MonthlyPaymentDetails d=new MonthlyPaymentDetails();
			d.setMonth(i+1);
			d.setMonthlyInterest(tmpLoan*interestRate);
			d.setMonthlyPaidLoan(monthlyPayment-d.getMonthlyInterest());
			d.setRemainingLoan(tmpLoan-d.getMonthlyPaidLoan());
			details.add(d);
			tmpLoan=d.getRemainingLoan();
		}
	}
	
	private void calculateMonthlyPayment(double loanAmount, double interestRate, int loanTerm) {
		monthlyPayment =  loanAmount * interestRate * Math.pow(interestRate + 1, loanTerm)
				/ (Math.pow(interestRate + 1, loanTerm) - 1);
	}
	
	public void printMontlyPaymentDetailFor(int month) {
		System.out.println(details.get(month-1));
	}

	public double getInterestRate() {
		return interestRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public List<MonthlyPaymentDetails> getDetails() {
		return details;
	}

	public void setDetails(List<MonthlyPaymentDetails> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Loan [loanAmount=" + loanAmount + ", interestRate=" + interestRate + ", loanTerm=" + loanTerm
				+ ", monthlyPayment=" + monthlyPayment + "]";
	}

	
	
	
}
