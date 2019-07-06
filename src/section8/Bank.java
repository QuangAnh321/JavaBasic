package section8;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

	private static ArrayList<Branch> branchList;
	private static Scanner scanner;
	private static Bank bank = new Bank();

	public Bank() {
		branchList = new ArrayList<Branch>();
		scanner = new Scanner(System.in);
	}

	public static ArrayList<Branch> getBranchList() {
		return branchList;
	}

	public static void setBranchList(ArrayList<Branch> branchList) {
		Bank.branchList = branchList;
	}

	public void addNewBranch() {
		String branchName = "";

		System.out.println("Enter Branch name: ");
		branchName = scanner.nextLine();

		if (findBranchByName(branchName) != -1) {
			System.err.print("This branch name already exist");
			System.out.println("");
		} else {
			Branch branch = new Branch();
			branch.setBranchName(branchName);
			branchList.add(branch);
			System.out.println("New branch added successfully");

		}
	}

	public void addNewCustomertoBranch() {
		String branchName = "";
		System.out.println("Enter Branch name you want to add customer to: ");
		branchName = scanner.nextLine();
		int branchIndex = findBranchByName(branchName);
		if (branchIndex == -1) {
			System.err.print("The branch with name" + branchName + " cannot be found, please try again");
			System.out.println("");
		} else {
			Branch branch = branchList.get(branchIndex);
			System.out.println("Enter new customer name: ");
			String customerName = scanner.nextLine();
			System.out.println("Enter initial transaction");
			Double transaction = Double.parseDouble(scanner.nextLine());
			branch.addNewCustomer(transaction, customerName);
			System.out.println("Customer: " + customerName + " added to branch " + branchName + " successfully");

		}
	}

	public void addTransactiontoCustomer() {
		System.out.println("Enter the name of the customer you want to add trasaction to: ");
		String customerName = scanner.nextLine();
		for (int i = 0; i < branchList.size(); i++) {
			Branch branch = branchList.get(i);
			int customerIndex = branch.findCustomerByName(customerName);
			if (customerIndex != -1) {
				Customer customer = branch.getCustomersList().get(customerIndex);
				System.out.println("Enter the amount of transaction of this customer");
				Double transaction = Double.parseDouble(scanner.nextLine());
				branch.addTransaction(transaction, customer);
				System.out.println("Transaction of " + transaction + " by customer " + customer.getCustomerName()
						+ " performed successfully");
				break;
			}
			System.err.println("No customer found");
		}
	}

	public int findBranchByName(String name) {
		for (int i = 0; i < branchList.size(); i++) {
			if (branchList.get(i).getBranchName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public void showAllBranches() {
		for (int i = 0; i < branchList.size(); i++) {
			System.out.println("Branch name: " + branchList.get(i).getBranchName());
			System.out.println("Number of customers in this branch: " + branchList.get(i).getCustomersList().size());
		}
	}

	public void showBranchDetails() {
		String branchName = "";
		System.out.println("Enter Branch name you want view details: ");
		branchName = scanner.nextLine();
		int branchIndex = findBranchByName(branchName);
		if (branchIndex == -1) {
			System.err.print("The branch with name" + branchName + " cannot be found, please try again");
			System.out.println("");
		} else {
			Branch branch = branchList.get(branchIndex);
			int numberofCustomers = branch.getCustomersList().size();
			System.out.println("This branch has: " + numberofCustomers + " customer(s)");
			if (numberofCustomers > 0) {
				for (int i = 0; i < numberofCustomers; i++) {
					Customer customer = branch.getCustomersList().get(i);
					System.out.println("Customer name: " + customer.getCustomerName());
					for (int k = 0; k < customer.getTransactions().size(); k++) {
						int number = k + 1;
						System.out.println("Transaction " + number + ": " + customer.getTransactions().get(k));
					}
				}
			}

		}
	}

	public static void showInstruction() {
		System.out.println("Press: ");
		System.out.println("0 to show this instruction");
		System.out.println("1 to add a new branch");
		System.out.println("2 to show all branches");
		System.out.println("3 to add a new customer to a branch");
		System.out.println("4 to add transaction to an existing customer");
		System.out.println("5 to view details of a branch");
		System.out.println("6 to to quit");
	}

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		showInstruction();
		while (!quit) {
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				showInstruction();
				break;
			case 1:
				bank.addNewBranch();
				break;
			case 2:
				bank.showAllBranches();
				break;
			case 3:
				bank.addNewCustomertoBranch();
				break;
			case 4:
				bank.addTransactiontoCustomer();
				break;
			case 5:
				bank.showBranchDetails();
				break;
			case 6:
				quit = true;
				System.out.println("Shutting down...");
				break;
			default:
				System.out.println("Please choose a vaild option");
			}
		}
	}
}
