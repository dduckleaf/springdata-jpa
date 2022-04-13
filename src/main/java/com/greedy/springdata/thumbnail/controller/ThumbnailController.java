package com.greedy.springdata.thumbnail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/thumbnail")
public class ThumbnailController {

    @GetMapping("/list")
    public ModelAndView thumbnailList(ModelAndView mv) {


        mv.setViewName("/thumbnail/list");

        return mv;
    }

}
