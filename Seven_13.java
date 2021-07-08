// (Random number selector) Write a method that returns a random number from a
// list of numbers passed in the argument. The method header is specified as follows:

public class Seven_13{

// Main Method
	public static void main(String[] args) {
		int[] numbers={3,3,3,5,4,6,7,8,9,0};

		
	System.out.println("Number generated: " + getRandom(numbers));	
	}

// generate Random Integers
	public static int getRandom(int... numbers){
		int result;
			int random=numbers.length-(int)(Math.random()*numbers.length)-1;
				result=numbers[random];	
			return result;
		}
	
}