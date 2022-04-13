package com.greedy.springdata.notice.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "Notice")
@Table(name = "TBL_NOTICE")
public class Notice {

    @Id
    @Column(name = "NOTICE_NO")
    private int no;

    @Column(name = "NOTICE_TITLE")
    private String title;

    @Column(name = "NOTICE_BODY")
    private String body;

    @JoinColumn(name = "NOTICE_WRITER_MEMBER_NO")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private com.greedy.springdata.notice.entity.Member writer;		//MemberTable과 join하는 경우 1:1 조인이 될 것이기 때문에 MemberDTO 타입으로 생성

    @Column(name = "NOTICE_COUNT")
    private int count;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "NOTICE_STATUS")
    private String status;


}
