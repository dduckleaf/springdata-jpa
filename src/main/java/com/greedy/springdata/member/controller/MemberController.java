package com.greedy.springdata.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @RequestMapping(value = "/session")
    public String sendView(){

        return "main/mainPage";
    }

}
