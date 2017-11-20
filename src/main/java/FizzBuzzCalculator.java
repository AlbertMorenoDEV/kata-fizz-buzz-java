import java.util.HashMap;
import java.util.Map;

class FizzBuzzCalculator
{
    private Map<Integer, String> results;

    FizzBuzzCalculator()
    {
        this.results = new HashMap<>();

        for (int number=1; number<=100; number++) {
            results.put(number, process(number));
        }
    }

    Map<Integer, String> getResults()
    {
        return this.results;
    }

    private String process(Integer number)
    {
        if (isFizzNumber(number) && isBuzzNumber(number)) {
            return "FizzBuzz";
        }

        if (isFizzNumber(number)) {
            return "Fizz";
        }

        if (isBuzzNumber(number)) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    private boolean isBuzzNumber(Integer number)
    {
        return number%5 == 0;
    }

    private boolean isFizzNumber(Integer number)
    {
        return number%3 == 0;
    }
}
