package com.bayviewglen.daythree;

import java.util.Scanner;

public class BayviewGlenPools {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter length of pool");
		int lengthOfPool = keyboard.nextInt();
		System.out.println("Enter width of pool");
		int widthOfPool = keyboard.nextInt();
		System.out.println("Enter shallow depth of pool");
		int shallowDepth = keyboard.nextInt();
		System.out.println("Enter depth of deep end of pool");
		int deepDepth = keyboard.nextInt();
		System.out.println("Enter shallow length of pool");
		int shallowLength = keyboard.nextInt();
		System.out.println("Enter length of the transition of the pool");
		int transitionLength = keyboard.nextInt();
		
		double deepLength = lengthOfPool - shallowLength - (Math.sqrt((Math.pow((transitionLength),2)) - (Math.pow((deepDepth-shallowDepth),2))));
		if ((lengthOfPool - shallowLength - deepLength)<0) {
			System.out.println("Enter a longer length for the pool, > " + (shallowLength+deepLength) + " because the length of the shallowend and deepend cannot add up to be greater than the overall length!");
			lengthOfPool = keyboard.nextInt();
		}
		
		// find volume
		double volume;
		double sideArea = (deepDepth * lengthOfPool) - ((deepDepth - shallowDepth)*shallowLength) - (0.5 * (deepDepth - shallowDepth) * (lengthOfPool - shallowLength - deepLength));
		volume = widthOfPool * sideArea;
		double ninetyPercentVol = 0.9 * volume;
		
		// find SA
		double surfaceArea;
		surfaceArea = (2*sideArea)+(widthOfPool*deepDepth)+(widthOfPool*shallowDepth)+(deepLength*widthOfPool)+(shallowLength*widthOfPool)+(transitionLength*widthOfPool);
		// 2 side + deepside surface + shallowside surface + base of pool
		
		// find price
		double cost;
		final double PRICE_PER_METER_SQUARED = 55.5;
		cost = (PRICE_PER_METER_SQUARED)*surfaceArea;
		
		// print answer
		System.out.println("With " + lengthOfPool + " as the length of the pool, " + widthOfPool + " as the width, " + shallowDepth + " as the depth of the shallow end, " + deepDepth + " as the depth of the deep end, ");
		System.out.println(shallowLength + " as the length of the shallow end, and " + deepLength + " as the length of the deep end...");
		System.out.println("the pool would need: " + ninetyPercentVol + "L to be 90% full, the SA is: " + surfaceArea + " m2, and the cost would be $" + cost);

	}

}
