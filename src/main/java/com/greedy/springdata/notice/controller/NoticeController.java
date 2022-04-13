package com.greedy.springdata.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @GetMapping("/list")
    public ModelAndView noticeList(ModelAndView mv) {

        mv.setViewName("/notice/list");
        return mv;
    }
}
