package vasyaClerk;

/*The new "Avengers" movie has just been released! 
There are a lot of people at the cinema box office standing in a huge line. 
Each of them has a single 100, 50 or 25 dollars bill. A "Avengers" ticket costs 25 dollars.
Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
Can Vasya sell a ticket to each person and give the change if he initially has no money and sells the tickets strictly in the order people follow in the line?
Return YES, if Vasya can sell a ticket to each person and give the change. Otherwise return NO.*/

public class Line {
	public static String Tickets(int[] peopleInLine) {

		String speakVasya = "";
		int valueVasya = 0;

		for (int i = 0; i < peopleInLine.length; i++) {
			if (peopleInLine[i] - 25 > valueVasya) {
				speakVasya = "NO";
				break;
			} else {
				valueVasya += 25;
				speakVasya = "YES";
			}
		}
		System.out.println(speakVasya);	
		return speakVasya;
	}
}