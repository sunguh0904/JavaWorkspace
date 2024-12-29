package com.uhyeon.section02.javaconfg;

import com.uhyeon.common.Account;
import com.uhyeon.common.MemberDTO;
import com.uhyeon.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    // bean 등록
    @Bean
    public Account accountGenerator() {
        return new PersonalAccount(20, "110-234-567890");
    }

    // 의존성 주입
    @Bean
    public MemberDTO memberGenerator() {
        // 생성자 주입 방법
        return new MemberDTO(1, "판다", "panda@gmail.com", accountGenerator());

        // setter 주입 방법
/*
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("판다");
        member.setEmail("panda@gmail.com");
        member.setPersonalAccount(accountGenerator());
        return member;
*/
    }
}
