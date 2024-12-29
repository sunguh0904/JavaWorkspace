package com.uhyeon.section01.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class BookDTO {
    private int sequence;
    private int isbn;
    private String title;
    private String author;
    private String publisher;
    private Date createDate;
}
