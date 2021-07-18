package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Converter {

	static Scanner sc = new Scanner(System.in);
	static int choice = 0;
	static double quantity;
	static double result;
	static DecimalFormat df = new DecimalFormat("###.###");

	public static void main(String[] Args) {

		System.out.println("Welcome to the Unit Covnerter." + "\n");
		
		System.out.println("This program will only accept numerical inputs.");
		System.out.println("This program will round all converstions to 3 decimal places if needed (one thousandth of a unit).");
		System.out.println("If a conversion returns 0 and 0 was not the input, then the conversion yielded .0005 or less of the desired unit." + "\n");

		while(choice != 4) {
			System.out.println("Please select an option (1-4):" + "\n");
			System.out.println("1. Volume");
			System.out.println("2. Distance");
			System.out.println("3. Mass");
			System.out.println("4. Quit" + "\n");

			choice = sc.nextInt();

			if( choice > 4 || choice < 1) {
				System.out.println("\n" + "That is not a valid option" + "\n");
			}

			else {

				switch (choice) {

				case 1:	
					convertVolume();
					break;

				case 2:
					convertDistance();
					break;

				case 3:
					convertMass();
					break;
				}
			}
		}

		System.out.println("\n" + "Exiting Application");
	}

	public static void convertVolume() {

		while (choice != 7) {
			System.out.println();
			System.out.println("Please select an option (1-8):" + "\n");
			System.out.println("1. Teaspoons to Tablespoons");
			System.out.println("2. Teaspoons to Cups");
			System.out.println("3. Tablespoons to Teaspoons");
			System.out.println("4. Tablespoons to Cups");
			System.out.println("5. Cups to Teaspoons");
			System.out.println("6. Cups to Tablespoons");
			System.out.println("7. Back");
			System.out.println("8. Quit" + "\n");

			choice = sc.nextInt();

			if (choice == 7) {
				System.out.println();
				return;
			}
			
			if (choice == 8) {
				System.out.println("\n" + "Exiting Application");
				System.exit(0);
			}

			if( choice > 8) 
				System.out.println("That is not a valid option");

			else {
				System.out.println("\n" + "Input the quantity" + "\n");

				quantity = sc.nextDouble();
				
				switch (choice) {
				case 1:
					result = quantity / 3;
					System.out.println("\n" + quantity + " teaspoon(s) is " + df.format(result) + " tablespoon(s)");
					break;
				case 2:
					result = quantity / 48;
					System.out.println("\n" + quantity + " teaspoon(s) is " + df.format(result) + " cup(s)");
					break;

				case 3:
					result = quantity * 3;
					System.out.println("\n" + quantity + " tablespoon(s) is " + df.format(result) + " teaspoon(s)");
					break;

				case 4:
					result = quantity / 16;
					System.out.println("\n" + quantity + " tablespoon(s) is " + df.format(result) + " cup(s)");
					break;

				case 5:
					result = quantity * 48;
					System.out.println("\n" + quantity + " cup(s) is " + df.format(result) + " teaspoon(s)");
					break;

				case 6:
					result = quantity * 16;
					System.out.println("\n" + quantity + " cup(s) is " + df.format(result) + " tablespoon(s)");
					break;
				}
			}
		}
	}

	public static void convertDistance() {

		while (choice != 7) {
			System.out.println("\n" + "Please select an option (1-8):" + "\n");
			System.out.println("1. Feet to Meters");
			System.out.println("2. Feet to Miles");
			System.out.println("3. Meters to Feet");
			System.out.println("4. Meters to Miles");
			System.out.println("5. Miles to Feet");
			System.out.println("6. Miles to Meters");
			System.out.println("7. Back");
			System.out.println("8. Quit" + "\n");

			choice = sc.nextInt();

			if (choice == 7) {
				System.out.println();
				return;
			}
			if (choice == 8) {
				System.out.println("\n" + "Exiting Application");
				System.exit(0);
			}

			if( choice > 8) 
				System.out.println("That is not a valid option");

			else {
				System.out.println("\n" + "Input the quantity" + "\n");

				quantity = sc.nextDouble();

				switch (choice) {
				case 1:
					result = quantity / 3.281;
					System.out.println("\n" + quantity + " foot(feet) is " + df.format(result) + " meter(s)");
					break;

				case 2:
					result = quantity / 5280;
					System.out.println("\n" + quantity + " foot(feet) is " + df.format(result) + " mile(s)");
					break;

				case 3:
					result = quantity * 3.281;
					System.out.println("\n" + quantity + " meter(s) is " + df.format(result) + " foot(feet)");
					break;

				case 4:
					result = quantity / 1609.34;
					System.out.println("\n" + quantity + " meter(s) is " + df.format(result) + " mile(s)");
					break;

				case 5:
					result = quantity * 5280;
					System.out.println("\n" + quantity + " mile(s) is " + df.format(result) + " foot(feet)");
					break;

				case 6:
					result = quantity * 1609.34;
					System.out.println("\n" + quantity + " mile(s) is " + df.format(result) + " meter(s)");
					break;
				}
			}
		}
	}

	public static void convertMass() {

		while (choice !=7) {
			System.out.println("\n" + "Please select an option (1-8):" + "\n");
			System.out.println("1. Grams to Ounces");
			System.out.println("2. Grams to Pounds");
			System.out.println("3. Ounces to Grams");
			System.out.println("4. Ounces to Pounds");
			System.out.println("5. Pounds to Grams");
			System.out.println("6. Pounds to Ounces");
			System.out.println("7. Back");
			System.out.println("8. Quit" + "\n");


			choice = sc.nextInt();
			System.out.println();

			if (choice == 7) {
				return;
			}
			if (choice == 8) {
				System.out.println("Exiting Application");
				System.exit(0);
			}

			if( choice > 8) 
				System.out.println("That is not a valid option");

			else {
				System.out.println("Input the quantity" + "\n");

				quantity = sc.nextDouble();

				switch (choice) {
				case 1:
					result = quantity / 28.35;
					System.out.println("\n" + quantity + " gram(s) is " + df.format(result) + " ounce(s)");
					break;

				case 2:
					result = quantity / 453.592;
					System.out.println("\n" + quantity + " gram(s) is " + df.format(result) + " pound(s)");
					break;

				case 3:
					result = quantity * 28.35;
					System.out.println("\n" + quantity + " ounce(s) is " + df.format(result) + " gram(s)");
					break;

				case 4:
					result = quantity / 16;
					System.out.println("\n" + quantity + " ounce(s) is " + df.format(result) + " pound(s)");
					break;

				case 5:
					result = quantity * 453.592;
					System.out.println("\n" + quantity + " pound(s) is " + df.format(result) + " gram(s)");
					break;

				case 6:
					result = quantity * 16;
					System.out.println("\n" + quantity + " pound(s) is " + df.format(result) + " ounce(s)");
					break;
				}
			}
		}
	}
}
