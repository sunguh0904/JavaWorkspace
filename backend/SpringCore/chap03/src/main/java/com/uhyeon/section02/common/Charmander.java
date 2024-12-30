package com.uhyeon.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/* @Primary:
* 여러 bean을 찾게되는 경우 @Primary 어노테이션을 적용한 bean을 우선시 적용
* 동일한 타입의 클래스 중 한 개만 @Primary 어노테이션 사용 가능 */
@Primary
public class Charmander implements Pokemon {
    @Override
    public void attack() {
        System.out.println("파이리 불꽃 공격🔥");
    }
}
