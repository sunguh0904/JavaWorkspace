package com.uhyeon.section01.xmlconfig;

import com.uhyeon.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        /* XML Configration을 이용한 방법 */

        // ApplicationContext는 인터페이스 이므로 클래스를 이용해 생성해야 됨
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("section01/xmlconfig/spring-context.xml");

        // bean의 id를 이용해 bean 가져오는 방법
        MemberDTO member1 = (MemberDTO) context.getBean("member");
        System.out.println("id로 bean 가져오기 = " + member1);

        // bean의 클래스 메타 정보를 전달하여 가져오는 방법
        MemberDTO member2 = context.getBean(MemberDTO.class);
        System.out.println("class로 bean 가져오기 = " + member2);

        // bean의 id와 클래스 메타 정보를 둘 다 가져오는 방법 (가장 정확함)
        MemberDTO member3 = context.getBean("member", MemberDTO.class);
        System.out.println("id와 class로 bean 가져오기 = " + member3);
    }
}
