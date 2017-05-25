package Pokemon;
abstract public class PokemonCard extends Card{
	protected int hp = 0;
	protected int maxhp = 0;
	protected int xp = 0;
	protected int attack = 0;
	protected int evolveHp = 0;
	protected int evolveAttack = 0;
	 
	 public PokemonCard(String name, int hp, int maxhp, int xp,int attack,int evolveHp, int evolveAttack){
		this.hp = hp;
		this.maxhp = maxhp;
		this.xp = xp;
		this.attack = attack;
		this.evolveHp = evolveHp;
		
	}
	
	public void superEffective(){
		this.hp -= 20;
		
	}
	
	public void notEffective(){
		this.hp += 20;
	}
	
	public boolean attack(PokemonCard defender){
	defender.hp = defender.hp-this.attack;
	return false;
	}
	
} 