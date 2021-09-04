import java.util.Scanner;
public class AgeGuess {

	public static void main(String[] args) {
		String name;
		int ageGuess;
		
		Scanner input = new Scanner(System.in); //New Scanner Object input is declared
		
		System.out.print("Please Enter the name: ");
		name = input.nextLine(); //Reads the name from Keyboard
		
		System.out.print("Please Enter the age: ");
		ageGuess = input.nextInt();//Reads the age from Keyboard
		
		System.out.println("Name is  " +name);//Display the name
		
		System.out.println("Age is " +ageGuess);//Display the age Guess

	}

}
