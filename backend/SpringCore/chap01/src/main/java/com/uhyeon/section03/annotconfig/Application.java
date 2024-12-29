package com.uhyeon.section03.annotconfig;

import com.uhyeon.common.MemberDAO;
import com.uhyeon.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        // bean들의 이름을 배열로 반환
        String[] beanNames = context.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }

        /* getBean(memberDAO):
        * bean의 이름을 따로 지정해 주지않으면 클래스명의 첫 글자를 소문자로 변경 */
        MemberDAO memberDAO = context.getBean(MemberDAO.class);
        System.out.println(memberDAO.selectMember(1));
        System.out.println(memberDAO.insetMember(
                new MemberDTO(3, "use03", "pass03", "원숭이")
        ));
        System.out.println(memberDAO.selectMember(3));
    }
}
