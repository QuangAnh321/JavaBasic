package section8;

import java.util.ArrayList;

public class Customer {

	private String customerName;
	private ArrayList<Double> transactions;
	
	public Customer(Double initialTransactionValue) {
		transactions = new ArrayList<Double>();
		transactions.add(initialTransactionValue);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String cutstomerName) {
		this.customerName = cutstomerName;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Double> transactions) {
		this.transactions = transactions;
	}
	
	
}
