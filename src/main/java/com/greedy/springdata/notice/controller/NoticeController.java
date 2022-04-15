package com.greedy.springdata.notice.controller;

import com.greedy.springdata.notice.dto.NoticeDTO;
import com.greedy.springdata.notice.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    private final NoticeService noticeService;

    @Autowired
    public NoticeController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }


    @GetMapping("/list")
    public ModelAndView selectAllNoticeList(ModelAndView mv) {

        List<NoticeDTO> noticeList = noticeService.selectAllNoticeList();
        mv.addObject("noticeList", noticeList);
        mv.setViewName("notice/list");

        System.out.println("mv 확인 = " + mv);
        return mv;
    }
}
