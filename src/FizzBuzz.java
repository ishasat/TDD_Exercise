
public class FizzBuzz {
	public String fizzBuzz(Integer inputNum) {
		boolean divisibleByThree = inputNum % 3 == 0;
		boolean divisibleByFive = inputNum % 5 == 0;
		String returnValue = "";

		if(divisibleByThree && divisibleByFive){
			returnValue = "fizzbuzz";
		}else if(divisibleByThree){
			returnValue = "fizz";
		}else if(divisibleByFive){
			returnValue = "buzz";
		}else{
			returnValue = inputNum.toString();
		}

		return returnValue;
	}

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		for (int i = 1; i <= 100; i++) {
			System.out.println(fb.fizzBuzz(i));
		}
}

