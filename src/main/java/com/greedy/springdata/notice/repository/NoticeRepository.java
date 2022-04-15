package com.greedy.springdata.notice.repository;

import com.greedy.springdata.notice.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice, Integer> {

    @Query(value = "SELECT A.NOTICE_NO " +
            "             , A.NOTICE_TITLE " +
            "             , A.NOTICE_BODY " +
            "             , A.NOTICE_WRITER_MEMBER_NO " +
            "             , B.NICKNAME " +
            "             , A.NOTICE_COUNT " +
            "             , A.CREATED_DATE " +
            "         FROM TBL_NOTICE A " +
            "         JOIN TBL_MEMBER B ON (A.NOTICE_WRITER_MEMBER_NO = B.MEMBER_NO) " +
            "        WHERE A.NOTICE_STATUS = 'Y' " +
            "        ORDER BY A.NOTICE_NO DESC",
    nativeQuery = true)
    List<Notice> findAllNotice();
}
