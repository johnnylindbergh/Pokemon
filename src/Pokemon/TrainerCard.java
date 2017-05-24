package Pokemon;
import java.util.Scanner;

abstract public class TrainerCard extends Card{
// potion, HP UP, Help From Mom, Evolution Stone
	
	public enum CardName{POTION, HP_UP, HELP_FROM_MOM, EVOLUTION_STONE};
	CardName name;
	public TrainerCard(CardName type) {
		this.name = type;
	}

	
	public void execute(Player playing, Player waiting){
		
		/*Scanner input = new Scanner(System.in); 
		 * if (this.name == Type.EVOLUTION_STONE){
		 * 	print : which pokemon do you want to evolve?
		 * init integer i
		 * get response and set int i to it  
		 * locate pokemon and call its evolve function 
		 * }
		 */
	
	 
		if(name.equals(CardName.POTION)){
			System.out.println("Which Pokemon would you like to heal?");
			// pokemon.hp += 20;
			int i = ProjectIO.input.nextInt();
			 playing.bench[i].hp +=20;
		}
		
		/*
		if(name.equals(CardName.HP_UP)){
			System.out.println("Which Pokemon would you like to boost?");
			// use 'input' to select a pokemon
			//pokemon.max_hp += 20;
			//pokemon.hp += 20;
		}
		if(name.equals(CardName.HELP_FROM_MOM)){
			
		}
*/
	}
	
}