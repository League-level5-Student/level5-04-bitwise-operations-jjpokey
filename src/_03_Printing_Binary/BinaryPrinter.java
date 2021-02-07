package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public void printByteBinary(byte b) { //not done
		// We first want to print the bit in the one's place
		String converted = convertToBinary(b);
		
		for(int i = 0; i < converted.length(); i++) { // (this is the last step, not done correctly should ask)
			
		int onesPlace = converted.charAt(converted.length() - i - 1);
		System.out.println(onesPlace);
		// Shift b seven bits to the right
		int bShifted = (b >> 7);
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
		int mask = onesPlace & 1;
		// Print the result using System.out.print (NOT System.out.println)
		System.out.print(mask);
		//Use this method to print the remaining 7 bits of b
		}
	}
	
	public void printShortBinary(short s) {
		// Create 2 byte variables
		byte a;
		byte b;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
	}
	
	public void printIntBinary(int i) {
		// Create 2 short variables
		short a;
		short b;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
		long a;
		long b;
		//continue
	}
	
	public static String convertToBinary(int input) { //MY METHOD TO CONVERT TO BINARY
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
	
	
	public static void main(String[] args) {
		// Test your methods here
		BinaryPrinter br = new BinaryPrinter();
		
		br.printByteBinary((byte) 14); //not sure about input
	}
}
