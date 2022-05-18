package bmi_calculator;

public class BmiCalculator {

	public double calculateBMR(int age, int inches, int pounds) {
		double BMR;
		BMR = 66 + (6.2 * pounds) + (12.7 * inches) - (6.76 * age);
		return BMR;
	}
	
	public double convertWeight(int pounds) {
		return pounds / 2.2;
	}
	
	public double convertHeight(int inches) {
		return inches / 39.37;
	}
	
	public double calculateBMI(int inches, int weight) {
		double kiloGrams;
		double meters;
		double BMI;
		
		kiloGrams = convertWeight(weight);
		meters = convertHeight(inches);
		
		BMI = kiloGrams / (meters * meters);
		return BMI;
	}
	
	public String weightClassification(double BMI) {
		String classification = "";
		if(BMI <= 18.5) {
			classification = "Classification: Underweight";
		}
		if(BMI >= 18.5 && BMI <= 24.9) {
			classification = "Classification: Normal weight";
		}
		if(BMI >= 25 && BMI <= 29.9) {
			classification = "Classification: Overweight";
		}
		if(BMI >= 30) {
			classification = "Classification: Obese";
		}
		
		return classification;
	}
	
	public void showActivityOptions() {
		System.out.println("What is you activity level?");
		System.out.println("1. Sedentary - minimal activity.");
		System.out.println("2. Lightly Active - minimal activity, but do some standing and moving.");
		System.out.println("3. Moderately Active - mostly standing at your job or exercizing 3x per week.");
		System.out.println("4. Very Active - physically intensive job, working out majority of the week.");
	}
	
	public void calculateTDEE(double BMR, String activity_level) {
		double TDEE;
		
		switch(activity_level) {
		case "1": 
			TDEE = BMR * 1.2;
			System.out.println("Your TDEE is: " + TDEE);
			calsToEat(TDEE);
			break;
		
		case "2":
			TDEE = BMR * 1.375;
			System.out.println("Your TDEE is: " + TDEE);
			calsToEat(TDEE);
			break;
			
		case "3":
			TDEE = BMR * 1.725;
			System.out.println("Your TDEE is: " + TDEE);
			calsToEat(TDEE);
			break;
			
		case "4":
			TDEE = BMR * 1.9;
			System.out.println("Your TDEE is: " + TDEE);
			calsToEat(TDEE);
			break;
			
		default:
			System.out.println("Sorry cannot compute!");
		}
	}
	
	public void calsToEat(double TDEE) {
		double calsPerDay;
		System.out.println("Now let us figure your calorie consumption for weight loss.");
		System.out.println("To keep things simple, let us start with 1 pound per week");
		System.out.println("To safely lose 1 pound per week, deduct 500 from your TDEE.");
		calsPerDay = TDEE - 500;
		System.out.println("Recommended intake per day: " + calsPerDay);
	}
}
