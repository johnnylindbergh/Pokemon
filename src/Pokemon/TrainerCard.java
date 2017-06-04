package Pokemon;

abstract public class TrainerCard extends Card{
// potion, HP UP, Help From Mom, Evolution Stone
	
	public enum CardName{POTION, HP_UP, HELP_FROM_MOM, EVOLUTION_STONE};
	CardName nameEnum;
	String name;
	
	public TrainerCard(CardName type) {
		cardType(false);
		this.nameEnum = type;
		this.name = type.name();
		
	}

	 public void print(){
		 System.out.println("Name: "+this.name); 	 
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
	
	 
		if(nameEnum.equals(CardName.POTION)){
			System.out.println("Which Pokemon would you like to heal?");
			// pokemon.hp += 20;
			int i = ProjectIO.input.nextInt();
			playing.bench[i].hp +=20;
			// what about a feature that says something like "(Pokemon Name" was healed!"
		}
		
		if(nameEnum.equals(CardName.HP_UP)){
			System.out.println("Which Pokemon would you like to boost?");
			// I guess we need to provide input options, right?
			int i = ProjectIO.input.nextInt();
			playing.bench[i].hp +=20;
			playing.bench[i].maxhp +=20;
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