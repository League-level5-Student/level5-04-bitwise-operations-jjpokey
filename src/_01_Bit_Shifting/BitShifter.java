package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4; //100
		int numShifted = num << 1; //1000 (8)
		
		// 2. Print the value of numShifted, and convert that value to binary.
		
		
		
		System.out.println(convertToBinary(numShifted));
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		// 4. Try shifting num 3 places.
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
	public static String convertToBinary(int input) {
		String output = "";
		int changedInput;

		
		while(input > 0) {
			changedInput = input % 2;
			
			if(changedInput == 0) {
				output = "0" + output;
			}
			else {
				output = "1" + output;
			}
			input = input / 2;
		}
		
		return output;
		
	}

}
