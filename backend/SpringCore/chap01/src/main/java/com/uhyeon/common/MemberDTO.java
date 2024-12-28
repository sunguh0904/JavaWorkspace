package com.uhyeon.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/* @Data:
* getter, setter, toString, equals, hashCode 메소드 생성 */
@Data
@AllArgsConstructor
public class MemberDTO {
    private int sequence;
    private String id;
    private String pwd;
    private String name;
}
