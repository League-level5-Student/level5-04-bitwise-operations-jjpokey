package _05_Pseudo_RNG;

public class PseudoRNG {
	/*
	 * It is impossible for a computer to come up with a series of numbers 
	 * that are truly random. They can, however, use mathematical algorithms
	 * to generate numbers that can seem random. These are called pseudo random 
	 * numbers.
	 * 
	 */
	
	public long seed;
	//2. Make a constructor that initializes the memeber variable
	public PseudoRNG(long seed) {
		this.seed = seed;
	}
	//3. Complete the steps inside the xorShift method
	
	//4. Complete the steps in the main method
	
	//5. Write your own pseudo random generation method. You can use the xor
	//    shift as a guide. Use the main method to test it.
	
	
	
	// This is called the xor shift. It is a very simple algorithm to generate
	// Pseudo random numbers. 
	long xorShift(){
		//1. Create a local long called seed and set it equal to the member variable 
		//   We will only use the local variable for the rest of the method
		long seed = this.seed;
		//2. Shift seed to the left 13 bits and save the result
		long seed2 = (seed << 13);											 //step 1
		//3. xor seed by the result of step 1 and save that result
		long seed3 = seed^seed2; 											//step 2
		//4. Set seed equal to the result of step 2
	seed = seed3; 															//step 3
		//5. Shift seed to the right 7 bits and save the result
		long seed4 = (seed >> 7); 												//step 4
		//6. xor seed by the result of step 4 and save that result
				long seed5 = seed^seed4; 										//step 5
		//7. Set seed equal to the result of step 5
		seed = seed5; 															//step 6
		//8. Shift seed to the left 17 bits and save the result
		long seed6 = (seed << 17); 												//step 7
		//9. xor seed by the result of step 7 and save that result
			long seed7 = seed^seed6; 											//step 8
		//10. Set seed equal to the result of step 8
		seed = seed7;
		//11. change the line below to return seed
		return seed;
		
		//For fun, see if you can rewrite the method using only 4 lines of code
	}
	
	
	
	public static void main(String[] args) {
	
		//1. Create a PseudoRNG object with any seed. 
		PseudoRNG pRNG = new PseudoRNG(System.currentTimeMillis());
		System.out.println("Time: " + System.currentTimeMillis());
		//2. Print the result of xorShift() 3 times and note the random numbers. 
		for(int i = 0; i < 3; i++) {
			System.out.println(pRNG.xorShift());	
		}
		//3. Create a second PSeudoRNG object with a different seed and print the result of xorShift 3 times.
		PseudoRNG pRNG2 = new PseudoRNG(System.currentTimeMillis());
		for(int j = 0; j < 3; j++) {
			System.out.println(pRNG2.xorShift());	
		}
		//4. Run the tests a second time and notice that 3 random numbers are the same because the seed generates the same sequence of random numbers.
		
		//If you would like to set the seed with a number that is hard to predict, you can use System.currentTimeMillis().
	
	}
}


