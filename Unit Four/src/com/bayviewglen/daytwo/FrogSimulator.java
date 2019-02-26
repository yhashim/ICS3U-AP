package com.bayviewglen.daytwo;

public class FrogSimulator {

	public static void main(String[] args) {
		private int goalDistance;
		private int maxHops;
		
		public boolean simulate() {
			int currentDistance = 0;
			
			for (int i = 0; i < maxHops; i++) { 
				currentDistance += hopDistance();
				if (currentDistance >= goalDistance) {
					return true;
				}
			}
			return false;
		}

	}

	private static int hopDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double runSimulations(int num) {
		int numSuccess = 0;
		
		for (int i = 0; i < num; i++) {
			if (simulate()) {
				numSuccess++;
			}
		}
		
		return (double)numSuccess/num;
	}

}
