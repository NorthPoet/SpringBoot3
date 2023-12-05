package com.north.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author North
 * @Date 2023/12/5 16:11
 */
@RestController
public class Book {

    public String test() {
        System.out.println("分支操作");
        System.out.println("master test");
        System.out.println("fix test");
        return "Hello Git";
    }
}
