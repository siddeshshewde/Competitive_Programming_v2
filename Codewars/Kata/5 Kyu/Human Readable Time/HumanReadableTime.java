/*
Title:
	Human Readable Time

Kata:
	https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

Description:
	Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

	HH = hours, padded to 2 digits, range: 00 - 99
	MM = minutes, padded to 2 digits, range: 00 - 59
	SS = seconds, padded to 2 digits, range: 00 - 59
	The maximum time never exceeds 359999 (99:59:59)

	You can find some examples in the test fixtures.
*/

public class HumanReadableTime {
  	public static String makeReadable(int seconds) {
	    int hours = seconds / 3600;
	    seconds = seconds - hours * 3600;
	    int minutes = seconds / 60;
	    seconds = seconds - minutes * 60;
	    String ans = "";
	    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
  	}
}