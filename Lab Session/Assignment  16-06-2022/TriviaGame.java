package corejava;

import java.util.Scanner;

public class TriviaGame {
	
	//creating and initializing array
	public static int[] points = {2,3,2,3,5};
	public static String[] answers = {"LOTUS","TIGER","HOCKEY","DELHI","PEACOCK"};
	
	//creating static trivialMehtod which takes 2 String parameters
	public static int triviaMethod(String[] questions, String[] stt) {
		Scanner sc = new Scanner(System.in);
		
		int point=0;
		for(int i=0;i<5;i++) {
			System.out.println(questions[i]);
			System.out.println(stt[i]);
			if(stt[i].toUpperCase().equals(answers[i])) {	//converting input string arr to uppercase & comparing with answers
				System.out.println("Correct!");
				point+=points[i];		
				System.out.println("");
			}
			else {
				System.out.println("Wrong answer");
				System.out.println("");
			}
		}
		sc.close();
		return point;			
	}
	public static void main(String[] args) {
		/*Enter your code here. Read input from STDIN. Print output to STDOUT */ 
		int point;
		Scanner sc = new Scanner(System.in);
		String[] stt=new String[5];
		String[] questions = {
				"Question 1: What is the National Flower of INDIA?",
				"Question 2: What is the National Animal of INDIA?",
				"Question 3: What is the National Game of INDIA?",
				"Question 4: What is the capital of INDIA ?",
				"Question 5: What is the National Bird of INDIA ?",
		};
		//for traversing through questions and taking input of each
		for(int i=0;i<5;i++) {			
			System.out.println(questions[i]);
			System.out.print("Answer: " );
			stt[i]=sc.nextLine();
		}
		point=triviaMethod(questions,stt);		//calling trivialMethod and storing in int point
		System.out.println("Final score: "+point);
		
		//for declaring rewards according to score/points
		if(point==15) {
			System.out.println("Congrats! You are the winner");
		}
		else if (point<15 && point>12) {
			System.out.println("Congrats! RunnerUp");
		}
		else {
			System.out.println("Better Luck Next Time");
		}
		sc.close();
	}
}
