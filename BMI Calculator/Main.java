package bmi_calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BmiCalculator new_calc = new BmiCalculator();
		Scanner scnr = new Scanner(System.in);
		int age;
		int heightInches;
		int weightPounds;
		double BMI;
		double BMR;
		String selection;
		boolean loopRelay = true;
		
		System.out.println("What is your age?");
		age = scnr.nextInt();
		System.out.println("What is your height in inches?");
		heightInches = scnr.nextInt();
		System.out.println("What is your weight in pounds?");
		weightPounds = scnr.nextInt();
		
		BMR = Math.round(new_calc.calculateBMR(age, heightInches, weightPounds));
		BMI = Math.round(new_calc.calculateBMI(heightInches, weightPounds));
		
		//System.out.println(new_calc.weightClassification(BMI));
		
		while(loopRelay) {
			new_calc.showActivityOptions();
			selection = scnr.next();
			new_calc.calculateTDEE(BMR, selection);
			loopRelay = false;
		}
		scnr.close();
	}

}
