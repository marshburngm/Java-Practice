package car_dealership;

import java.util.Scanner;

public class Dealership {

	public static void main(String[] args) {
		
		Vehicle[] vehicles = new Vehicle[3];//creating array to hold vehicles
		Employee employee = new Employee();//creating employee
		
		Customer customer1 = new Customer("Geoff", "null street", 25000);//TODO Create prompt to input a random customer and fill details into constructor
		
		Vehicle vehicle = new Vehicle("Honda", "Accord", 17000);//creating inventory of vehicles
		Vehicle vehicle2 = new Vehicle("Ford", "Explorer", 25000);
		Vehicle vehicle3 = new Vehicle("Dodge", "Ram", 22000);
		
		vehicles[0] = vehicle;//populating vehicles array
		vehicles[1] = vehicle2;
		vehicles[2] = vehicle3;
		
		boolean loopRelay = true;
		
		while(loopRelay){
			menu();
			Scanner input = new Scanner(System.in);
			int userInput = input.nextInt();
			
			switch(userInput){
			
			case 1: 
				for(Vehicle object : vehicles) {
					System.out.println(object);
				}
				break;

			case 2:
				System.out.println("Which vehicle would you like to purchase?");
				input.nextLine();
				String choice = input.nextLine();

				if(choice.equalsIgnoreCase("Accord")){
					customer1.purchaseCar(vehicle, employee, false);
				}else if(choice.equalsIgnoreCase("Explorer")){
					customer1.purchaseCar(vehicle2, employee, false);
				}else
					customer1.purchaseCar(vehicle3, employee, false);

				loopRelay = false;
				break;

			case 3:
				System.out.println("Leaving dealership.");
				loopRelay = false;
			}
		}
	}
	
	public static void menu(){
		System.out.println("Hello! Welcome to our Online Car Dealership.");
		System.out.println("Please tell us what you would like to do.");
		System.out.println("1. Look around.");
		System.out.println("2. Buy Vehicle.");
		System.out.println("3. Exit.");
	}
}
