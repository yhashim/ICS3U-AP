package com.bayviewglen.daytwo;

public class ExampleEight {

	public static void main(String[] args) {
		Mystery[] arr = new Mystery[4];
		
		for(Mystery i : arr){
			System.out.println(i);
		}
		System.out.println();
		for (int i=0; i<arr.length; i++){
			arr[i] = new Mystery();
		}
		
		for(Mystery i : arr){
			System.out.println(i);
		}
		
		System.out.println();
		
		for(Mystery i : arr){
			i.updateX();
		}
		
		for(Mystery i : arr){
			System.out.println(i);
		}

	}

}
