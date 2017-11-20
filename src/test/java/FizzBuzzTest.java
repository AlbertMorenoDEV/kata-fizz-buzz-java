import static org.junit.Assert.assertEquals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Map;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest
{
	@Test
	public void should_create_new_instance()
	{
		FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

		String classType = fizzBuzzCalculator.getClass().toString();

		assertEquals("class FizzBuzzCalculator", classType);
	}

	@Test
	public void should_return_one_hundred_results()
	{
		FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

		Map<Integer, String> results = fizzBuzzCalculator.getResults();

		assertEquals(100, results.size());
	}

	@Test
	@Parameters({
			"1",
			"2",
			"4",
			"7",
			"8"
	})
	public void should_return_same_number_for_others(int number)
	{
		FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

		Map<Integer, String> results = fizzBuzzCalculator.getResults();

		assertEquals(String.valueOf(number), results.get(number));
	}

	@Test
	@Parameters({
			"3",
			"6",
			"9",
			"12"
	})
	public void should_return_fizz_for_multiples_of_three(int number)
	{
		FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

		Map<Integer, String> results = fizzBuzzCalculator.getResults();

		assertEquals("Fizz", results.get(number));
	}

	@Test
	@Parameters({
			"5",
			"10",
			"20"
	})
	public void should_return_buzz_for_multiples_of_five(int number)
	{
		FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

		Map<Integer, String> results = fizzBuzzCalculator.getResults();

		assertEquals("Buzz", results.get(number));
	}

	@Test
	@Parameters({
			"15",
			"30",
			"60"
	})
	public void should_return_fizzbuzz_for_multiples_of_three_and_five(int number)
	{
		FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

		Map<Integer, String> results = fizzBuzzCalculator.getResults();

		assertEquals("FizzBuzz", results.get(number));
	}
}
