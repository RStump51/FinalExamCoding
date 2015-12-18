package ch.makery.address.model;

import domain.RateDomainModel;
import org.apache.poi.ss.formula.functions.FinanceLib;
public class Rate extends RateDomainModel {
	
	public double getPayment(int NumberOfPayments)
	{
		
		
		
		double InterestRate;
		InterestRate = this.getInterestRate();
		
		double PV;
		PV = this.getPV();
		NumberOfPayments = (int) getPayment(NumberOfPayments);
		int FV = 0; 
		boolean Compounding = true;
		double PMT;
		PMT = FinanceLib.pmt(NumberOfPayments, InterestRate, PV, FV, Compounding);
		
		
		
		
		return PMT;
	}

	private double getPV() {
		// TODO Auto-generated method stub
		return 0;
	}
}
