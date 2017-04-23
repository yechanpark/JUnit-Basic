import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AddWithPositiveArgsExceptionTest {

	private int value1;
	private int value2;

	public AddWithPositiveArgsExceptionTest(int v1, int v2) {
		value1 = v1;
		value2 = v2;
	}

	@Test(expected = InvalidArgumentException.class)
	public void addWithPositiveArgsException() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.addWithPositiveArgs(value1, value2);
	}

	@Test
	public void addWithPositiveArgsForPositives() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.addWithPositiveArgs(10, 20);
		assertEquals(30, calc.getResult());
	}

	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][] {
			{ -2, 1 },
			{ 1, -2 },
			{ -1, -1 } });
	}

}
