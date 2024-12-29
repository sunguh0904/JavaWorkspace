package com.uhyeon.common;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private int sequence;
    private String name;
    private String email;
    private Account personalAccount;
}
