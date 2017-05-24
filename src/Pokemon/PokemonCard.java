package Pokemon;
abstract public class PokemonCard extends Card{
	protected int hp = 0;
	protected int maxhp = 0;
	protected int xp = 0;
	protected int attack = 0;
	 
	public void pokemonConstructor(String name, int hp, int maxhp, int xp){
		this.hp = hp;
	}
	
	public void superEffective(){
		this.hp -= 20;
		
	}
	
	public void notEffective(){
		this.hp += 20;
	}
	

	
	
}