package com.uhyeon.section02.annotation.subsection01.primary;

import com.uhyeon.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    private Pokemon pokemon;

    /* 생성자 주입 방식이 하나일 때 @Autowired 어노테이션 생략 가능
    * 두 개 이상일 경우 명시적으로 작성하여 우선 순위를 표시할 수 있음 */
    // @Autowired
    public PokemonService(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
