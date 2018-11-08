package section4;

public class IfElseStatement {

	public static int scoreCaculator(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			return finalScore;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {

		int newScore = scoreCaculator(true, 800, 5, 100);

		boolean gameOver = false;
		int score = 1000;
		int levelCompleted = 6;
		int bonus = 200;

		int newScore2 = scoreCaculator(gameOver, score, levelCompleted, bonus);
		System.out.println(newScore);
		System.out.println(newScore2);
		

	}

}
