import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddWithPositiveArgsExceptionTest.class, SimpleCalculatorTest.class, WeiredAddTest.class })
public class AllTests {

}
