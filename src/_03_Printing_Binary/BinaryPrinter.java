package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */
int count = 0;
	
	public void printByteBinary(byte b) { 
		// We first want to print the bit in the one's place
		 
		String converted = (byte) (b & 1) + "";
		String convertFinish = "";
		
		for(int i = 0; i < 8; i++) { 
			
			// Shift b seven bits to the right
			
			// Use the & operator to "mask" the bit in the one's place
			// This can be done by "anding" (&) it with the value of 1
			int mask = b & 1;
			// Print the result using System.out.print (NOT System.out.println)
			
			//Use this method to print the remaining 7 bits of b
		convertFinish = mask + convertFinish;
		
		b = (byte) (b >> 1);
		
		}
		if(count == 0) {
			System.out.println("\n Byte:");
		}
		else if(count == 1) {
			System.out.println("\n Short:");
		}
		else if(count == 2) {
			System.out.println("\n Int:");
		}
		else if(count == 3) {
			System.out.println("\n Long:");
		}
		System.out.println(convertFinish);
	}
	
	public void printShortBinary(short s) {
		if(!(count >= 1)) {
		count = 1;
		}
		// Create 2 byte variables
		byte a;
		byte b;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte

		a = (byte) (s);
		b = (byte) (s >> 8);
		
		
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
			printByteBinary(a);
			printByteBinary(b);
		
	}
	
	public void printIntBinary(int i) {
		if(!(count >= 2)) {
			count = 2;
			}
		// Create 2 short variables
		short a;
		short b;
		// Use bit shifting and masking (&) to save the first
		// i in the other short
		a = (short) (i);
		b = (short) (i >> 16);
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(a);
		printShortBinary(b);
	}
	
	public void printLongBinary(long l) {
		if(!(count >= 3)) {
			count = 3;
			}
		// Use the same method as before to complete this method
		int a;
		int b;
		//continue
		a = (int) (l);
		b = (int) (l >> 32);
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printIntBinary(a);
		printIntBinary(b);
	}
	
	public static String convertToBinary(int input) { //NOT USING THIS
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
		
		br.printByteBinary((byte) 14); 
		br.printShortBinary((short) 300);
		br.printIntBinary(33000);
		br.printLongBinary((long) 3000000000l);
	}
}
