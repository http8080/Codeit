package Æ÷ÄÏ¸óGO;

import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {

	private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

	public ArrayList<Pokemon> getPokemons(String name) {
		return pokemons.get(name);
	}

	public void add(Pokemon pokemon){
        String name = pokemon.name;
        if(getPokemons(name) == null){
            ArrayList<Pokemon> value = new ArrayList<>();
            value.add(pokemon);
            pokemons.put(name, value);
        }
        getPokemons(name).add(pokemon);
    }

	public Pokemon getStrongest(String name) {
		ArrayList<Pokemon> pokemonList = getPokemons(name);
		if(pokemonList == null)
			return null;
		Pokemon strongest = null;
		
		for(Pokemon pokemon : pokemonList) {
			if(strongest == null || pokemon.cp > strongest.cp)
				strongest = pokemon;
		}
		return strongest;
	}

	public Pokemon getStrongest() {
		Pokemon strongest = null;
		
		for(String key : pokemons.keySet()) {
			Pokemon p = getStrongest(key);
			
			if(strongest == null || p.cp > strongest.cp)
				strongest = p;
		}
		return strongest;
	}

}
