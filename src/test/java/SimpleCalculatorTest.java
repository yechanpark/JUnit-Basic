import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleCalculatorTest {
	SimpleCalculator calc;

	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("AfterClass");
	}
	
	@Before
	public void setUp() {
		System.out.println("Before");
		calc = new SimpleCalculator();
	}
	
	@After
	public void tearDown() {
		System.out.println("After");
	}

	@Test
	public void addWithPositives() {
		System.out.println("addWithPositives");
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
	}

	@Test
	public void addWithZeros() {
		System.out.println("addWithZeros");
		calc.add(0, 0);
		assertEquals(0, calc.getResult());
	}

	@Test
	public void decWithTen() {
		System.out.println("decWithTen");
		calc.dec(10);
		assertEquals(-10, calc.getResult());
	}

	@Test
	public void divWithPositives() {
		System.out.println("divWithPositives");
		calc.div(10, 2);
		assertEquals(5, calc.getResult());
	}

	@Test(expected=InvalidArgumentException.class)
	public void divWithZero() {
		System.out.println("divWithZero");
		calc.div(10, 0);
		// assertEquals(5, calc.getResult());
	}

	@Test
	public void addWithPositiveArgsWithAllPositives() {
		System.out.println("addWithPositiveArgsWithAllPositives");
		calc.addWithPositiveArgs(10, 20);
		assertEquals(30, calc.getResult());
	}

	@Test(expected = InvalidArgumentException.class)
	public void addWithPositiveArgsWithOneNagative() {
		System.out.println("addWithPositiveArgsWithOneNagative");
		calc.addWithPositiveArgs(-10, 20);
	}

}
