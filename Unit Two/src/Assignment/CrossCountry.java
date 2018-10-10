package Assignment;
/*
 * Name: Cross Country Assignment
 * Author: Yosra Hashim
 * Date: 10/10/2018 (hand in date)
 * Description: a program that will take input data from 5 members of the cross country team,
 * 				then prints individual summaries, and finally a full summary of the team...
 * 				it could have been way more efficient by using a function repeatedly and arrays... but 
 * 				I just did it using what we have learned so far.
 */
import java.util.Scanner;

public class CrossCountry {
	
	public static void main(String[] args) {
		// This program first takes information from each team member, then displays an individual summary
		// After the fifth member receives a personal summary, the program returns a full team summary chart/table
		Scanner input = new Scanner(System.in);
				
		// runner 1
		System.out.print("Insert full name (First Last): ");
		String fullName1 = input.nextLine();
		String firstName = fullName1.substring(0, fullName1.indexOf(" "));
		// receive split 1 information
		System.out.print("Hello, " + firstName + ". How long did it take for you to arrive to the 1st mile mark? (mm:ss.sss) ");
		String firstSplit1 = input.nextLine(); 
		// receive split 2 information
		System.out.print("How long did it take for you to get from the beginning to the end of the 2nd mile mark? ");
		String secondSplit1 = input.nextLine(); 
		// receive total run information
		System.out.print("How long did it take for you to complete the total run? ");
		String totalTime1 = input.nextLine(); 
		// find data from each input, for future calculations (to determine the second, and third split time)
		int firstSplitMins1 = Integer.parseInt(firstSplit1.substring(0, firstSplit1.indexOf(":")));
		double firstSplitSecs1 = Double.parseDouble(firstSplit1.substring(firstSplit1.indexOf(":")+1));
		String firstSplitRunner1 = String.format("%d:%06.3f", firstSplitMins1, firstSplitSecs1);
		
		int secondSplitMins1 = Integer.parseInt(secondSplit1.substring(0, secondSplit1.indexOf(":")));
		double secondSplitSecs1 = Double.parseDouble(secondSplit1.substring(secondSplit1.indexOf(":")+1));
		
		double secondSplitAloneTotalSecs1 = (((60*secondSplitMins1)+secondSplitSecs1)-((60*firstSplitMins1)+firstSplitSecs1));
		// change the minutes to seconds in order to do subtraction
		int secondSplitAloneMins1 = (int)(secondSplitAloneTotalSecs1/60);
		double secondSplitAloneSecs1 = secondSplitAloneTotalSecs1%60;
		String secondSplitAloneRunner1 = String.format("%d:%06.3f", secondSplitAloneMins1, secondSplitAloneSecs1);
		
		int totalSplitMins1 = Integer.parseInt(totalTime1.substring(0, totalTime1.indexOf(":")));
		double totalSplitSecs1 = Double.parseDouble(totalTime1.substring(totalTime1.indexOf(":")+1));
		String totalSplitRunner1 = String.format("%d:%06.3f", totalSplitMins1, totalSplitSecs1);
		
		double thirdSplitTotalSecs1 = ((60*totalSplitMins1)+totalSplitSecs1)-((60*secondSplitMins1)+secondSplitSecs1);
		// change the minutes to seconds in order to do subtraction
		int thirdSplitMins1 = (int)(thirdSplitTotalSecs1/60);
		double thirdSplitSecs1 = thirdSplitTotalSecs1%60;
		String thirdSplitRunner1 = String.format("%d:%06.3f", thirdSplitMins1, thirdSplitSecs1);
		
		// print individual summary
		System.out.println("");
		System.out.println("Runner 1 Summary");
		System.out.printf("%-15s%-15s\n", "Name:", fullName1);
		System.out.printf("%-15s%-15s\n", "Split 1: ", firstSplitRunner1);
		System.out.printf("%-15s%-15s\n", "Split 2: ", secondSplitAloneRunner1);
		System.out.printf("%-15s%-15s\n", "Split 3: ", thirdSplitRunner1);
		System.out.printf("%-15s%-15s\n", "Total Time: ", totalSplitRunner1);
		System.out.println("");
		
		// runner 2
		System.out.print("Insert full name (First Last): ");
		String fullName2 = input.nextLine();
		firstName = fullName2.substring(0, fullName2.indexOf(" "));
		// receive split 1 information
		System.out.print("Hello, " + firstName + ". How long did it take for you to arrive to the 1st mile mark? (mm:ss.sss) ");
		String firstSplit2 = input.nextLine(); 
		// receive split 2 information
		System.out.print("How long did it take for you to get from the beginning to the end of the 2nd mile mark? ");
		String secondSplit2 = input.nextLine(); 
		// receive total run information
		System.out.print("How long did it take for you to complete the total run? ");
		String totalTime2 = input.nextLine(); 
		// find data from each input, for future calculations (to determine the second, and third split time)
		int firstSplitMins2 = Integer.parseInt(firstSplit2.substring(0, firstSplit2.indexOf(":")));
		double firstSplitSecs2 = Double.parseDouble(firstSplit2.substring(firstSplit2.indexOf(":")+1));
		String firstSplitRunner2 = String.format("%d:%06.3f", firstSplitMins2, firstSplitSecs2);
		
		int secondSplitMins2 = Integer.parseInt(secondSplit2.substring(0, secondSplit2.indexOf(":")));
		double secondSplitSecs2 = Double.parseDouble(secondSplit2.substring(secondSplit2.indexOf(":")+1));
		
		double secondSplitAloneTotalSecs2 = (((60*secondSplitMins2)+secondSplitSecs2)-((60*firstSplitMins2)+firstSplitSecs2));
		// change the minutes to seconds in order to do subtraction
		int secondSplitAloneMins2 = (int)(secondSplitAloneTotalSecs2/60);
		double secondSplitAloneSecs2 = secondSplitAloneTotalSecs2%60;
		String secondSplitAloneRunner2 = String.format("%d:%06.3f", secondSplitAloneMins2, secondSplitAloneSecs2);
				
		int totalSplitMins2 = Integer.parseInt(totalTime2.substring(0, totalTime2.indexOf(":")));
		double totalSplitSecs2 = Double.parseDouble(totalTime2.substring(totalTime2.indexOf(":")+1));
		String totalSplitRunner2 = String.format("%d:%06.3f", totalSplitMins2, totalSplitSecs2);
				
		double thirdSplitTotalSecs2 = ((60*totalSplitMins2)+totalSplitSecs2)-((60*secondSplitMins2)+secondSplitSecs2);
		// change the minutes to seconds in order to do subtraction
		int thirdSplitMins2 = (int)(thirdSplitTotalSecs2/60);
		double thirdSplitSecs2 = thirdSplitTotalSecs2%60;
		String thirdSplitRunner2 = String.format("%d:%06.3f", thirdSplitMins2, thirdSplitSecs2);
				
		// print individual summary
		System.out.println("");
		System.out.println("Runner 2 Summary");
		System.out.printf("%-15s%-15s\n", "Name:", fullName2);
		System.out.printf("%-15s%-15s\n", "Split 1: ", firstSplitRunner2);
		System.out.printf("%-15s%-15s\n", "Split 2: ", secondSplitAloneRunner2);
		System.out.printf("%-15s%-15s\n", "Split 3: ", thirdSplitRunner2);
		System.out.printf("%-15s%-15s\n", "Total Time: ", totalSplitRunner2);
		System.out.println("");
		
		// runner 3
		System.out.print("Insert full name (First Last): ");
		String fullName3 = input.nextLine();
		firstName = fullName3.substring(0, fullName3.indexOf(" "));
		// receive split 1 information
		System.out.print("Hello, " + firstName + ". How long did it take for you to arrive to the 1st mile mark? (mm:ss.sss) ");
		String firstSplit3 = input.nextLine(); 
		// receive split 2 information
		System.out.print("How long did it take for you to get from the beginning to the end of the 2nd mile mark? ");
		String secondSplit3 = input.nextLine(); 
		// receive total run information
		System.out.print("How long did it take for you to complete the total run? ");
		String totalTime3 = input.nextLine(); 
		// find data from each input, for future calculations (to determine the second, and third split time)
		int firstSplitMins3 = Integer.parseInt(firstSplit3.substring(0, firstSplit3.indexOf(":")));
		double firstSplitSecs3 = Double.parseDouble(firstSplit3.substring(firstSplit3.indexOf(":")+1));
		String firstSplitRunner3 = String.format("%d:%06.3f", firstSplitMins3, firstSplitSecs3);
		
		int secondSplitMins3 = Integer.parseInt(secondSplit3.substring(0, secondSplit3.indexOf(":")));
		double secondSplitSecs3 = Double.parseDouble(secondSplit3.substring(secondSplit3.indexOf(":")+1));
		
		double secondSplitAloneTotalSecs3 = (((60*secondSplitMins3)+secondSplitSecs3)-((60*firstSplitMins3)+firstSplitSecs3));
		// change the minutes to seconds in order to do subtraction
		int secondSplitAloneMins3 = (int)(secondSplitAloneTotalSecs3/60);
		double secondSplitAloneSecs3 = secondSplitAloneTotalSecs3%60;
		String secondSplitAloneRunner3 = String.format("%d:%06.3f", secondSplitAloneMins3, secondSplitAloneSecs3);
				
		int totalSplitMins3 = Integer.parseInt(totalTime3.substring(0, totalTime3.indexOf(":")));
		double totalSplitSecs3 = Double.parseDouble(totalTime3.substring(totalTime3.indexOf(":")+1));
		String totalSplitRunner3 = String.format("%d:%06.3f", totalSplitMins3, totalSplitSecs3);
				
		double thirdSplitTotalSecs3 = ((60*totalSplitMins3)+totalSplitSecs3)-((60*secondSplitMins3)+secondSplitSecs3);
		// change the minutes to seconds in order to do subtraction
		int thirdSplitMins3 = (int)(thirdSplitTotalSecs3/60);
		double thirdSplitSecs3 = thirdSplitTotalSecs3%60;
		String thirdSplitRunner3 = String.format("%d:%06.3f", thirdSplitMins3, thirdSplitSecs3);
				
		// print individual summary
		System.out.println("");
		System.out.println("Runner 3 Summary");
		System.out.printf("%-15s%-15s\n", "Name:", fullName3);
		System.out.printf("%-15s%-15s\n", "Split 1: ", firstSplitRunner3);
		System.out.printf("%-15s%-15s\n", "Split 2: ", secondSplitAloneRunner3);
		System.out.printf("%-15s%-15s\n", "Split 3: ", thirdSplitRunner3);
		System.out.printf("%-15s%-15s\n", "Total Time: ", totalSplitRunner3);
		System.out.println("");
		
		// runner 4
		System.out.print("Insert full name (First Last): ");
		String fullName4 = input.nextLine();
		firstName = fullName4.substring(0, fullName4.indexOf(" "));
		// receive split 1 information
		System.out.print("Hello, " + firstName + ". How long did it take for you to arrive to the 1st mile mark? (mm:ss.sss) ");
		String firstSplit4 = input.nextLine(); 
		// receive split 2 information
		System.out.print("How long did it take for you to get from the beginning to the end of the 2nd mile mark? ");
		String secondSplit4 = input.nextLine(); 
		// receive total run information
		System.out.print("How long did it take for you to complete the total run? ");
		String totalTime4 = input.nextLine(); 
		// find data from each input, for future calculations (to determine the second, and third split time)
		int firstSplitMins4 = Integer.parseInt(firstSplit4.substring(0, firstSplit4.indexOf(":")));
		double firstSplitSecs4 = Double.parseDouble(firstSplit4.substring(firstSplit4.indexOf(":")+1));
		String firstSplitRunner4 = String.format("%d:%06.3f", firstSplitMins4, firstSplitSecs4);
		
		int secondSplitMins4 = Integer.parseInt(secondSplit4.substring(0, secondSplit4.indexOf(":")));
		double secondSplitSecs4 = Double.parseDouble(secondSplit4.substring(secondSplit4.indexOf(":")+1));
		
		double secondSplitAloneTotalSecs4 = (((60*secondSplitMins4)+secondSplitSecs4)-((60*firstSplitMins4)+firstSplitSecs4));
		// change the minutes to seconds in order to do subtraction
		int secondSplitAloneMins4 = (int)(secondSplitAloneTotalSecs4/60);
		double secondSplitAloneSecs4 = secondSplitAloneTotalSecs4%60;
		String secondSplitAloneRunner4 = String.format("%d:%06.3f", secondSplitAloneMins4, secondSplitAloneSecs4);
				
		int totalSplitMins4 = Integer.parseInt(totalTime4.substring(0, totalTime4.indexOf(":")));
		double totalSplitSecs4 = Double.parseDouble(totalTime4.substring(totalTime4.indexOf(":")+1));
		String totalSplitRunner4 = String.format("%d:%06.3f", totalSplitMins4, totalSplitSecs4);
				
		double thirdSplitTotalSecs4 = ((60*totalSplitMins4)+totalSplitSecs4)-((60*secondSplitMins4)+secondSplitSecs4);
		// change the minutes to seconds in order to do subtraction
		int thirdSplitMins4 = (int)(thirdSplitTotalSecs4/60);
		double thirdSplitSecs4 = thirdSplitTotalSecs4%60;
		String thirdSplitRunner4 = String.format("%d:%06.3f", thirdSplitMins4, thirdSplitSecs4);
				
		// print individual summary
		System.out.println("");
		System.out.println("Runner 4 Summary");
		System.out.printf("%-15s%-15s\n", "Name:", fullName4);
		System.out.printf("%-15s%-15s\n", "Split 1: ", firstSplitRunner4);
		System.out.printf("%-15s%-15s\n", "Split 2: ", secondSplitAloneRunner4);
		System.out.printf("%-15s%-15s\n", "Split 3: ", thirdSplitRunner4);
		System.out.printf("%-15s%-15s\n", "Total Time: ", totalSplitRunner4);
		System.out.println("");
		
		// runner 5
		System.out.print("Insert full name (First Last): ");
		String fullName5 = input.nextLine();
		firstName = fullName5.substring(0, fullName5.indexOf(" "));
		// receive split 1 information
		System.out.print("Hello, " + firstName + ". How long did it take for you to arrive to the 1st mile mark? (mm:ss.sss) ");
		String firstSplit5 = input.nextLine(); 
		// receive split 2 information
		System.out.print("How long did it take for you to get from the beginning to the end of the 2nd mile mark? ");
		String secondSplit5 = input.nextLine(); 
		// receive total run information
		System.out.print("How long did it take for you to complete the total run? ");
		String totalTime5 = input.nextLine(); 
		// find data from each input, for future calculations (to determine the second, and third split time)
		int firstSplitMins5 = Integer.parseInt(firstSplit5.substring(0, firstSplit5.indexOf(":")));
		double firstSplitSecs5 = Double.parseDouble(firstSplit5.substring(firstSplit5.indexOf(":")+1));
		String firstSplitRunner5 = String.format("%d:%06.3f", firstSplitMins5, firstSplitSecs5);
		
		int secondSplitMins5 = Integer.parseInt(secondSplit5.substring(0, secondSplit5.indexOf(":")));
		double secondSplitSecs5 = Double.parseDouble(secondSplit5.substring(secondSplit5.indexOf(":")+1));
		
		double secondSplitAloneTotalSecs5 = (((60*secondSplitMins5)+secondSplitSecs5)-((60*firstSplitMins5)+firstSplitSecs5));
		// change the minutes to seconds in order to do subtraction
		int secondSplitAloneMins5 = (int)(secondSplitAloneTotalSecs5/60);
		double secondSplitAloneSecs5 = secondSplitAloneTotalSecs5%60;
		String secondSplitAloneRunner5 = String.format("%d:%06.3f", secondSplitAloneMins5, secondSplitAloneSecs5);
				
		int totalSplitMins5 = Integer.parseInt(totalTime5.substring(0, totalTime5.indexOf(":")));
		double totalSplitSecs5 = Double.parseDouble(totalTime5.substring(totalTime5.indexOf(":")+1));
		String totalSplitRunner5 = String.format("%d:%06.3f", totalSplitMins5, totalSplitSecs5);
				
		double thirdSplitTotalSecs5 = ((60*totalSplitMins5)+totalSplitSecs5)-((60*secondSplitMins5)+secondSplitSecs5);
		// change the minutes to seconds in order to do subtraction
		int thirdSplitMins5 = (int)(thirdSplitTotalSecs5/60);
		double thirdSplitSecs5 = thirdSplitTotalSecs5%60;
		String thirdSplitRunner5 = String.format("%d:%06.3f", thirdSplitMins5, thirdSplitSecs5);
				
		// print individual summary
		System.out.println("");
		System.out.println("Runner 5 Summary");
		System.out.printf("%-15s%-15s\n", "Name:", fullName5);
		System.out.printf("%-15s%-15s\n", "Split 1: ", firstSplitRunner5);
		System.out.printf("%-15s%-15s\n", "Split 2: ", secondSplitAloneRunner5);
		System.out.printf("%-15s%-15s\n", "Split 3: ", thirdSplitRunner5);
		System.out.printf("%-15s%-15s\n", "Total Time: ", totalSplitRunner5);
		System.out.println("");
		
		// full team summary
		// use negative spacing for names (align left), so that the name length doesn't move the other column data
		System.out.printf("%45s\n","Team Summary: ");
		System.out.printf("%s\n","--------------------------------------------------------------------------------");
		System.out.printf("%-20s%15s%15s%15s%15s\n","Name", "Split 1", "Split 2", "Split 3", "Total Time");
		System.out.printf("%s\n","--------------------------------------------------------------------------------");
		System.out.printf("%-20s%15s%15s%15s%15s\n",fullName1, firstSplitRunner1, secondSplitAloneRunner1, thirdSplitRunner1, totalSplitRunner1);
		System.out.printf("%-20s%15s%15s%15s%15s\n",fullName2, firstSplitRunner2, secondSplitAloneRunner2, thirdSplitRunner2, totalSplitRunner2);
		System.out.printf("%-20s%15s%15s%15s%15s\n",fullName3, firstSplitRunner3, secondSplitAloneRunner3, thirdSplitRunner3, totalSplitRunner3);
		System.out.printf("%-20s%15s%15s%15s%15s\n",fullName4, firstSplitRunner4, secondSplitAloneRunner4, thirdSplitRunner4, totalSplitRunner4);
		System.out.printf("%-20s%15s%15s%15s%15s\n",fullName5, firstSplitRunner5, secondSplitAloneRunner5, thirdSplitRunner5, totalSplitRunner5);
		System.out.printf("%s\n","--------------------------------------------------------------------------------");

		input.close();
		
	}

}
