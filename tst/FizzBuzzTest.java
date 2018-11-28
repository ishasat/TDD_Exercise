import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz;

	@Before
	public void setUp(){
		fizzBuzz= new FizzBuzz();
	}
	@Test
	public void testWhenPassedNumberReturnNumber() {
		assertEquals("1",fizzBuzz.fizzBuzz(1));
	}

	@Test
	public void testWhenPassedTwoReturnTwo() {
		assertEquals("2", fizzBuzz.fizzBuzz(2));
	}

	@Test
	public void testWhenPassedNumDivisibleByThreeReturnFizz(){
		assertEquals("fizz", fizzBuzz.fizzBuzz(3));
		assertEquals("fizz", fizzBuzz.fizzBuzz(6));
	}
}

