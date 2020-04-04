public class NthSeries {

	public static String seriesSum(int n) {
		float result = 1.0f;
		float baseNum = 1.0f;
		if (n <= 0) result = 0;
		else {
			for (int i = 1; i < n; i++) {
				baseNum = baseNum + 3;
				result += 1.0 / baseNum;
			}
		}
		return String.format("%.2f", result);
	}
  }