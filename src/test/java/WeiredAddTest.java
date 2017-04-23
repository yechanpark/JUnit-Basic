import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WeiredAddTest {

	private int expected;
	private int value1;
	private int value2;

	public WeiredAddTest(int e, int v1, int v2) {
		expected = e;
		value1 = v1;
		value2 = v2;
	}

	@Test
	public void weiredAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.weiredAdd(value1, value2);
		assertEquals(expected, calc.getResult());
	}

	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][] { { 30, 10, 20 }, { 0, 0, 0 }, { 100, 5, 7 }, { -10, -5, -5 } });
	}

}