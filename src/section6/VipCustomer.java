package section6;

public class VipCustomer {

	private String name;
	
	private int creditLimit;
	
	private String emailAddress;
	
	// Use all default values
	public VipCustomer() {
		this("QuangAnh", 100000, "abc@gmail.com");
	}
	
	// Save two values
	public VipCustomer(String name, int creditLimit) {
		this.name = name;
		this.creditLimit = creditLimit;
	}
	
	// save all values
	public VipCustomer(String name, int creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
}
