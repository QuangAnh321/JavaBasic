package section8;

import java.util.ArrayList;

public class Branch {

	private ArrayList<Customer> customersList;
	private String branchName;

	public Branch() {
		customersList = new ArrayList<Customer>();
	}

	public void addNewCustomer(Double initialTransactionValue, String name) {
		Customer customer = new Customer(initialTransactionValue);
		customer.setCustomerName(name);
		customersList.add(customer);
	}

	public void addTransaction(Double transactionValue, Customer customer) {
		customer.getTransactions().add(transactionValue);
	}

	public ArrayList<Customer> getCustomersList() {
		return customersList;
	}

	public void setCustomersList(ArrayList<Customer> customersList) {
		this.customersList = customersList;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int findCustomerByName(String name) {
		for (int i = 0; i < customersList.size(); i++) {
			if (customersList.get(i).getCustomerName().equals(name)) {
				return i;
			}
		}
		return -1;

	}

}
