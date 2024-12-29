package com.uhyeon.section03.annotconfig;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.uhyeon")
public class ContextConfiguration {
    /* @ComponentScan:
    * 자기랑 같은 패키지에 있는 클래스를 스캔해서 컴포넌트 어노테이션이 있는 것을 bean으로 설정 */
}
