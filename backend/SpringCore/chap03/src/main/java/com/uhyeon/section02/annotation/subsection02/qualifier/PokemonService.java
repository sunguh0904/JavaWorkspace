package com.uhyeon.section02.annotation.subsection02.qualifier;

import com.uhyeon.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pokemonServiceQualifier")
public class PokemonService {
    private Pokemon pokemon;

    /* @Qualifier:
    * 동일한 타입의 여러 bean 중 특정 bean을 선택할 때 사용
    * bean 이름은 기본적으로 클래스 이름의 첫 글자를 소문자로 바꾼 형태
    * @Qualifier를 사용하면 이름으로 bean을 지정해 정확히 원하는 bean을 주입할 수 있음 */
    @Autowired
    public PokemonService(@Qualifier("squirtle") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void pokemonAttack() {
        pokemon.attack();
    }
}
