import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
@Category(Hong.class)
public class ExamGraderParameterizedTest {

	private String expected;
	private int middleScore;
	private int finalScore;
	private int homeworkScore;

	public ExamGraderParameterizedTest(String g, int m, int f, int h) {
		expected = g;
		middleScore = m;
		finalScore = f;
		homeworkScore = h;
	}

	@Test(expected = InvalidScopeException.class)
	public void gradeForNormalValues() {
		ExamGrader grader = new ExamGrader();
		String g = grader.grade(middleScore, finalScore, homeworkScore);
		assertEquals(expected, g);

	}

	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(
				new Object[][] {
					{ "A", 30, 30, 100 },
					{ "B", 25, 25, 100 },
					{ "C", 20, 30, 100 },
					{ "F", 10, 10, 100 } });
	}

}
