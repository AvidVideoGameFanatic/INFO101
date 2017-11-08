import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO insert your code here. For this excise, you need to complete the following code
		
		//Step 1: Identify the secret number
		//Please define a variable for the secret number, name it "secretNum", using the following syntax: 
		//[datatype] [name] = [initial value];
		int secretNum = 0;

		//We generate a random number in the range [1-10] and assign it to secretNum
		Random rand = new Random();
		secretNum =  rand.nextInt(10) + 1;
		
		
		//Step 2: ask the player for a number
		//Please define a variable for the user's guess, name it "guessNum", using the following syntax: 
		//[datatype] [name] = [initial value];
		int guessNum = 0;
		
		//loop structure
		while (true) {

			//Step 3: Ask the user for input
			//The following code is complete. It will show a dialogue window with the information
			// "Please input an integer number:" and a textbox for user's input
			//Once the user inputs a number, the system takes the number as a string and assign it to the inputString variable
			String inputString =
					JOptionPane.showInputDialog
					("Please input an integer number in the range of [1-10]:");
			
			//We convert the string to an integer and assign the integer value to the guessNum variable
			guessNum = Integer.parseInt(inputString);

			//Step 4: Compare the secret number and the player's guess
			//We want to show different messages in different situations:
			// If the user's input equals the secret number, display "You win!"; 
			// If the user's input is smaller than the secrete number, display "Your input is too small. Try again."
			// If the user's input is larger than the secrete number, display "Your input is too large. Try again."
			//The following code is NOT complete. Please fill in the code to define the situations.
			if (guessNum == secretNum) {
				JOptionPane.showMessageDialog
				(null, "You win!");
				break;
			} else if (guessNum < secretNum) {
				JOptionPane.showMessageDialog
				(null, "Your input is too small. Try again.");		
			} else {
				JOptionPane.showMessageDialog
				(null, "Your input is too large. Try again.");
			}
			
				

		}

	}
	
		}