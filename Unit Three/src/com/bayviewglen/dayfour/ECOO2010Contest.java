package com.bayviewglen.dayfour;

public class ECOO2010Contest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 2;
		int n = 1;
		int p = 2;
		int q = 1;
		
		// top frame
		for (int a = 0; a < q; a++) {
			for (int b = 0; b < 2*q + 2*p + m - 1; b++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		// top mat
		for (int c = 0; c < q; c++) {
			for (int d = 0; d < q; d++) {
				System.out.print("#");
			}
			for (int e = 0; e < (2*p)+n; e++) {
				System.out.print("+");
			}
			for (int f = 0; f < q; f++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		// middle
		for (int g = 0; g <= m; g++) {
			for (int h = 0; h < q; h++) {
				System.out.print("#");
			}
			for (int i = 0; i < p; i++) {
				System.out.print("+");
			}
			for (int j = 0; j < n; j++) {
				System.out.print(".");
			}
			for (int k = 0; k < p; k++) {
				System.out.print("+");
			}
			for (int l = 0; l < q; l++) {
				System.out.print("#");
			}
			System.out.println("");
		}		
		// bottom mat
		for (int c = 0; c < q; c++) {
			for (int d = 0; d < q; d++) {
				System.out.print("#");
			}
			for (int e = 0; e < (2*p)+n; e++) {
				System.out.print("+");
			}
			for (int f = 0; f < q; f++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		// bottom frame
		for (int a = 0; a < q; a++) {
			for (int b = 0; b < 2*q + 2*p + m -1; b++) {
				System.out.print("#");
			}
			System.out.println("");
		}


	}

}
