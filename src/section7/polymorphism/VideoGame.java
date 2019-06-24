package section7.polymorphism;

public class VideoGame {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	public VideoGame(String name) {
		this.name = name;
	}

	public String Plot() {
		return "No plot here";
	}
	
	public static VideoGame getAVideoGame() {
			int randomNumber = (int) (Math.random() * 5) + 1;
			System.out.println("The random number was: "+randomNumber);
			if (randomNumber == 1) {
				return new CallofDuty();
			} else if (randomNumber == 2) {
				return new Crysis();
			} else if (randomNumber == 3) {
				return new Heartstone();
			} else if (randomNumber == 4) {
				return new LeagueofLegend();
			} else if (randomNumber == 5) {
				return new Forgettable();
			} else {
				return null;
			}
		}
	
	
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			VideoGame game = getAVideoGame();
			System.out.println("Video game #" +i+ ": " +game.getName()+ "\n"+
			"Plot: " +game.Plot()+ "\n");
			
		}
	}

}
