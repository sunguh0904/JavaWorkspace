package com.uhyeon.section02.annotation.subsection03;

import com.uhyeon.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceCollection")
public class PokemonService {
    // List 타입으로 주입
/*
    private List<Pokemon> pokemonList;

    @Autowired
    public PokemonService(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public void pokemonAttack() {
        pokemonList.forEach(Pokemon::attack);
    }
*/

    // Map 타입으로 주입
    private Map<String, Pokemon> pokemonMap;

    public PokemonService(Map<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
    }

    public void pokemonAttack() {
        pokemonMap.forEach((k, v) -> {
            System.out.println("k = " + k);
            System.out.println("공격 = ");
            v.attack();
        });
    }
}
