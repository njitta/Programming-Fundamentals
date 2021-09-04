import java.util.Scanner;
public class TimeComp {

	public static void main(String[] args) {
		int inputSeconds;
		int hours;
		int minutes;
		int seconds;
		
		Scanner input = new Scanner(System.in);//New Scanner object input is declared
		
		System.out.print("Please Enter the Time in Seconds: ");
		inputSeconds = input.nextInt();//Reads the Time in Seconds from Keyboard
		
		//Calculating the time in hours, ,minutes and seconds by applying given formulas 
		
		hours=inputSeconds/3600;
		minutes=(inputSeconds%3600)/60;
		seconds=inputSeconds%60;
		
		System.out.println(inputSeconds+" is equivalent to "+hours+" Hours, "+minutes+" Minutes, "+seconds+" Seconds.");// Display the Final Result
	}

}
