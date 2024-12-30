package com.uhyeon.section02.annotation.subsection01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.uhyeon.section02");

        String[] beansName = context.getBeanDefinitionNames();
        for (String beanName : beansName) {
            System.out.println("beanName = " + beanName);
        }

        PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
        pokemonService.pokemonAttack();
    }
}
