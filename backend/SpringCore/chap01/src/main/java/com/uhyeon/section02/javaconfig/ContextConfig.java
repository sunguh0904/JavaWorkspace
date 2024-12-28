package com.uhyeon.section02.javaconfig;

import com.uhyeon.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfig {
    /* @Bean(name = "member"):
    * name 생략 가능, 이름을 명시하지 않으면 메소드 이름으로 자동 지정
    * 해당 메소드의 반환 값을 spring container에 bean으로 등록한다는 의미 */
    @Bean("getMember")
    public MemberDTO getMember() {
        return new MemberDTO(2, "user02", "pass02", "다람쥐");
    }
}
