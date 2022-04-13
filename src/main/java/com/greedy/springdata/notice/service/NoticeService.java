package com.greedy.springdata.notice.service;

import com.greedy.springdata.notice.dto.NoticeDTO;
import com.greedy.springdata.notice.entity.Notice;
import com.greedy.springdata.notice.repository.NoticeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoticeService {

    private final NoticeRepository noticeRepository;
    private ModelMapper modelMapper;

    @Autowired
    public NoticeService(NoticeRepository noticeRepository, ModelMapper modelMapper) {
        this.noticeRepository = noticeRepository;
        this.modelMapper = modelMapper;
    }

    public List<NoticeDTO> selectAllNoticeList() {

        List<Notice> noticeList = noticeRepository.findAllNotice();

        return noticeList.stream().map(notice -> modelMapper.map(notice, NoticeDTO.class)).collect(Collectors.toList());
    }
}
