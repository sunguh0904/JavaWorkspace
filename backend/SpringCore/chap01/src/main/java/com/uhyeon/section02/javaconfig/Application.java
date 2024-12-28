package com.uhyeon.section02.javaconfig;

import com.uhyeon.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        // 생성자에 @Configration 어노테이션이 달린 설정 클래스의 메타 정보를 전달
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfig.class);

        MemberDTO member = context.getBean("getMember", MemberDTO.class);
        System.out.println("member = " + member);
    }
}
