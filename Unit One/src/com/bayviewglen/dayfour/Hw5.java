package com.bayviewglen.dayfour;

public class Hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 5.5, y = 3.0, z = -2.0;
		int i = 5, j = 4, k = 3;
		
		int a = i-j;
		int d = i+j;
		int e = j/k;
		int f = i/j;
		int h = i+k;
		double b = x-y;
		double c = y-x;
		double g = x/k;
		
		
		//a
		System.out.println(i-(i-(i-(i-j))));
		//System.out.println(j);
		System.out.println(i-(i-(i-(a))));

		//b
		System.out.println((x-y)*(x+(i-j)));
		//System.out.println((Math.pow(x, 2)+(x*i)-(x*j)-(y*x)-(y*i)+(y*j)));
		System.out.println((b)*(x+a));
		
		//c
		System.out.println((x-y)-(y-x)-(x-y));
		//System.out.println(-1*(y-x));
		System.out.println((b)-(c)-(b));
		
		//d
		System.out.println((x-y)-((y-x)-((x-y)-(y-x))));
		//System.out.println((4*x)-(4*y));
		System.out.println((b)-((c)-((b)-(c))));
		
		//e
		System.out.println(i+j-k*i/j);
		System.out.println(d-k*f);
		
		//f
		System.out.println(i*j/k+i-j);
		//System.out.println(i);
		System.out.println(i*e+a);
		
		//g
		System.out.println(((i+k)*(i-k)/((i+j)*(i-j))));
		//System.out.println((int)((Math.pow(i, 2) - Math.pow(k, 2))/(Math.pow(i, 2) - Math.pow(j, 2))));
		System.out.println((h*(d)/((a)*(d))));
		
		//h
		System.out.println((double)i+j/k);
		System.out.println((double)i+e);
		
		//i
		System.out.println((int)x/k-x/k);
		System.out.println((int)g-g);
		
		//j
		System.out.println((double)i/j-(double)(i/j));
		System.out.println((double)i/j-(double)(f));

	}

}
