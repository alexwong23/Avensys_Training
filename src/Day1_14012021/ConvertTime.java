package Day1_14012021;

public class ConvertTime {

	public static String getDurationString(int minutes, int seconds) {
		String result = null;
		if(minutes < 0 || seconds < 0 || seconds > 59) {
			// return invalid value
			result = "Invalid parameters provided.";
		} else {
			// calculate 
			int calHours = minutes / 60;
			int calMinutes = minutes % 60;
			result = calHours + "h " + calMinutes + "m " + seconds + "s";
		}
		return result;
	}
	
	public static String getDurationString(double minutes, double seconds) {
		String result = null;
		if(minutes < 0 || seconds < 0 || seconds > 59) {
			// return invalid value
			result = "Invalid parameters provided.";
		} else {
			// calculate 
			int calHours = (int) minutes / 60;
			int calMinutes = (int) minutes % 60;
			result = calHours + "h " + calMinutes + "m " + (int) seconds + "s";
		}
		return result;
	}
	
	public static String getDurationString(int seconds) {
		String result = null;
		if(seconds < 0) {
			// return invalid value
			result = "Invalid parameters provided.";
		} else {
			// calculate 
			double calMinutes = (double) seconds / 60;
			result = Math.round(calMinutes * 100.0) / 100.0 + "m";
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getDurationString(0, 2));
		System.out.println(getDurationString(-1, 2));
		System.out.println(getDurationString(10, -1));
		System.out.println(getDurationString(10, 60));
		System.out.println(getDurationString(150, 30));
		System.out.println(getDurationString(121, 45));
		
		System.out.println(getDurationString(0.0, 2.0));
		System.out.println(getDurationString(-1.0, 2.0));
		System.out.println(getDurationString(10.0, -1.0));
		System.out.println(getDurationString(10.0, 60.0));
		System.out.println(getDurationString(150.0, 30.0));
		System.out.println(getDurationString(121.0, 45.0));
		
		System.out.println(getDurationString(-1));
		System.out.println(getDurationString(121));
		System.out.println(getDurationString(150));
	}
}
