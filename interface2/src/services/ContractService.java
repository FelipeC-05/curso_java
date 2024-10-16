package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		contract.getInstallment().add(new Installment(LocalDate.of(2018, 03, 01), 206.04));
	}
	
	
}
