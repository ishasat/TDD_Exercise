
public class FizzBuzz {
	public String fizzBuzz(Integer inputNum) {
		if(inputNum%3==0){
			return "fizz";
		}else if(inputNum%5==0){
			return "buzz";
		}

		return inputNum.toString();
	}
}

