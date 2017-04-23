import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ExamGraderExceptionTest {

	
	@Test(expected = InvalidScopeException.class)
	@Category(Hong.class)
	public void gradeForMidLessThanZero() {
		ExamGrader grader = new ExamGrader();
		grader.grade(-10, 20, 30);
	}

	@Test(expected = InvalidScopeException.class)
	@Category(Hong.class)
	public void gradeForMidGreaterThanMax() {
		ExamGrader grader = new ExamGrader();
		grader.grade(40, 20, 30);
	}

	@Test(expected = InvalidScopeException.class)
	public void gradeForFinLessThanZero() {
		ExamGrader grader = new ExamGrader();
		grader.grade(20, -10, 30);
	}

	@Test(expected = InvalidScopeException.class)
	public void gradeForFinGreaterThanMax() {
		ExamGrader grader = new ExamGrader();
		grader.grade(20, 40, 30);
	}

	@Test(expected = InvalidScopeException.class)
	public void gradeForHwLessThanZero() {
		ExamGrader grader = new ExamGrader();
		grader.grade(30, 20, -10);
	}

	@Test(expected = InvalidScopeException.class)
	public void gradeForHwGreaterThanMax() {
		ExamGrader grader = new ExamGrader();
		grader.grade(30, 20, 40);
	}
}
