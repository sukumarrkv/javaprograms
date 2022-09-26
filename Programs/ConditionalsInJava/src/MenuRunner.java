import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter number2: ");
		int number2 = scanner.nextInt();
		
		System.out.println("The choices available are: ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");
		
		System.out.print("Enter Chcoice: ");
		int choice = scanner.nextInt();
		
		usingSwitch(number1, number2, choice);
	}

	private static void usingNestedIf(int number1, int number2, int choice) {
		if(choice == 1){
			System.out.println("Result:" + (number1 + number2));
		}else if(choice == 2){
			System.out.println("Result:" + (number1 - number2));
		}else if(choice == 3){
			System.out.println("Result:" + (number1 * number2));
		} else if(choice == 4){
			System.out.println("Result:" + (number1 / number2));
		} else {
			System.out.println("Invalid Operation");
		}
		
	}
		private static void usingSwitch(int number1, int number2, int choice) {
			switch (choice){
			case 1 : System.out.println("Result:" + (number1 + number2)); break;
			case 2 : System.out.println("Result:" + (number1 - number2)); break;
			case 3 : System.out.println("Result:" + (number1 * number2)); break;
			case 4 : System.out.println("Result:" + (number1 / number2)); break;
			default : System.out.println("Invalid Operation"); break;
			}
	}

}
