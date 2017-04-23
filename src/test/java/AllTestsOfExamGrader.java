import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ ExamGraderExceptionTest.class, ExamGraderParameterizedTest.class })
public class AllTestsOfExamGrader {

}
