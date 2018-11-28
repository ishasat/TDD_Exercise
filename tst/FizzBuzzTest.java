import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testWhenPassedNumberReturnNumber() {
		FizzBuzz fizzBuzz= new FizzBuzz();
		assertEquals("1",fizzBuzz.fizzBuzz(1));
	}

	@Test
	public void testWhenPassedTwoReturnTwo() {
		FizzBuzz fizzBuzz= new FizzBuzz();
		assertEquals("2", fizzBuzz.fizzBuzz(2));
	}

	@Test
	public void testWhenPassedNumDivisibleByThreeReturnFizz(){
		FizzBuzz fizzBuzz= new FizzBuzz();
		assertEquals("fizz", fizzBuzz.fizzBuzz(3));
		assertEquals("fizz", fizzBuzz.fizzBuzz(6));
	}
}

