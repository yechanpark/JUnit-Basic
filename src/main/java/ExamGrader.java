
public class ExamGrader {

	public String grade(int m, int f, int h) {

		if (m < 0 || m > 35)
			throw new InvalidScopeException();
		if (f < 0 || f > 35)
			throw new InvalidScopeException();
		if (h < 0 || h > 30)
			throw new InvalidScopeException();

		int sum = m + f + h;

		if (sum >= 80 && sum <= 100)
			return "A";
		else if (sum >= 70 && sum < 80)
			return "B";
		else if (sum >= 60 && sum < 70)
			return "C";
		else
			return "F";

	}
}
