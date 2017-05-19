public class Card extends PokemonGame {
	public enum Type{POKEMON,TRAINER};
	static Type type;
	public static void pokemonConstructor(){
		type = Type.POKEMON;
		//change
	}
	public static void trainingConstructor(){
		type = Type.TRAINER;
	}
}
