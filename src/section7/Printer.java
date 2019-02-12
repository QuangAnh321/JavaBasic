package section7;

public class Printer {

	private int tonerLevel;
	private int numberofPagePrinted = 0;
	private boolean isDuplexPrinter;

	public Printer(int tonerLevel, boolean isDuplexPrinter) {
		if (tonerLevel >= 0 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			System.err.println("Toner level must be between 0 and 100 percent!");
		}
		this.isDuplexPrinter = isDuplexPrinter;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(int tonerLevel) {
		this.tonerLevel = tonerLevel;
	}

	public int getNumberofPagePrinted() {
		return numberofPagePrinted;
	}

	public void setNumberofPagePrinted(int numberofPagePrinted) {
		this.numberofPagePrinted = numberofPagePrinted;
	}

	public boolean isDuplexPrinter() {
		return isDuplexPrinter;
	}

	public void setDuplexPrinter(boolean isDuplexPrinter) {
		this.isDuplexPrinter = isDuplexPrinter;
	}

	public void fillToner(int level) {
		if (level > 0 && level <= 100) {
			if (tonerLevel == 100) {
				System.err.println("Printer toner is already full!");
			} else {
				int newTonerLevel = this.tonerLevel + level;
				if (newTonerLevel > 100) {
					System.err.println("Cannot fill more than the toner capacity!:");
				} else {
					System.out.println("Toner level now is: " +newTonerLevel);
				}
			}
		} else {
			System.err.println("Level to be filled must be between 1 and 100 percent");
		}
	}

	public void printAPage(int numberofPageTobePrinted) {
		this.numberofPagePrinted += numberofPageTobePrinted;
		System.out.println(this.numberofPagePrinted + " pages has been printed successfully!");
	}

	public static void main(String[] args) {
		Printer epson = new Printer(50, false);
		epson.fillToner(80);
	}
}
