import java.util.Scanner;

public class DoWhileRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number=-1;
		do {
			if(number!=-1){
				System.out.println("Cube is " + (number*number*number));
			}
			
			System.out.print("Enter the number: ");
		    number = scanner.nextInt();
        
		}while(number>=0);
		System.out.println("Execution Ended");
	}

}
