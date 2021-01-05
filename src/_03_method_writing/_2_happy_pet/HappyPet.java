package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	static int hapinessLevel= 0; 
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		
		String pet = JOptionPane.showInputDialog(null, "What kind of pet do you want to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for (int i=0; i<10; i++) {
		
		
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Pet Tasks", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle them", "give food", "take on walk" }, null);
			System.out.println(task);
			
			if (task==0) {
			cuddle();
			}
			
			else if (task==1) {
				food();
				}
			
			else if (task==2) {
				walk();
				
			}

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		
		
		if (hapinessLevel>=7) {
			JOptionPane.showMessageDialog(null, "You love your pet!");
			break;
		}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	static void cuddle () {
	JOptionPane.showMessageDialog(null, "Thanks for cuddles!");
	hapinessLevel += 2;
	}
	
	static void food() {
		JOptionPane.showMessageDialog(null, "Yummm!");
		hapinessLevel +=1;
	}
	
	static void walk() {
		JOptionPane.showMessageDialog(null, "Woohoo");
		hapinessLevel +=3;
	}
}
