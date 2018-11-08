package section4;

public class Score {

	public static String caculateHighScorePostion(int score) {
		String position2;
		if (score >= 1000) {
			position2 = "one";
			return position2;
		} else if (score > 500) {
			position2 = "two";
			return position2;
		} else if (score > 100) {
			position2 = "three";
			return position2;
		} else {
			position2 = "four";
			return position2;
		}
	}
	
	
	public static void displayHighScorePosition(String playerName, String position) {
		System.out.println(playerName + " managed to get into position " +position+ " on the high score table");
	}
	
	public static void main(String[] args) {
		String position = caculateHighScorePostion(1500);
		displayHighScorePosition("QuangAnh", position);
		
		position = caculateHighScorePostion(500);
		displayHighScorePosition("John", position);
		
		position = caculateHighScorePostion(900);
		displayHighScorePosition("Bob", position);
	}
}
