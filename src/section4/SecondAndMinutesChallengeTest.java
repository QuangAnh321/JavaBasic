package section4;

public class SecondAndMinutesChallengeTest {

	public static String getDurationString (int minutes, int seconds) {
		if (minutes < 0 || seconds < 0 || seconds > 59) {
			return "Invalid value";
		} else {
			int totalSecond = ((minutes * 60) + seconds);
			int hours = totalSecond / 3600;
			int remainingSecondAfterHours = totalSecond % 3600;
			int remainingMinutes = remainingSecondAfterHours / 60;
			int remainingSecond = remainingSecondAfterHours % 60;
			System.out.println(hours+ " h " +remainingMinutes+ " m " +remainingSecond+ " s ");
			return hours+ " h " +remainingMinutes+ " m " +remainingSecond+ " s ";
		}
	}
	
	public static String getDurationString (int seconds) {
		if (seconds < 0) {
			return "invalid value";
		} else {
			int minutes = seconds / 60;
			System.out.println(minutes);
			return minutes + " m ";
		}
	}
	
	public static void main(String[] args) {
		getDurationString(62, 2);
		getDurationString (60);
	}
}
