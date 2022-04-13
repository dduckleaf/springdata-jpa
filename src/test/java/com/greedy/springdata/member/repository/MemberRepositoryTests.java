package com.greedy.springdata.member.repository;

import com.greedy.springdata.config.JpaConfiguration;
import com.greedy.springdata.config.SpringdataApplication;
import com.greedy.springdata.member.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {
        SpringdataApplication.class,
        JpaConfiguration.class,
        com.greedy.springdata.config.ContextConfiguration.class
})
class MemberRepositoryTests {

    @Autowired
    private MemberRepository repo;

    @Test
    public void initTest() {

        assertNotNull(repo);
    }
    
    @Test
    @DisplayName("회원조회 테스트")
    public void findMemberById_test() {
        String username = "admin";
        
        Member member = repo.findMemberByMemberId(username);
        
        assertNotNull(member);
        System.out.println("member = " + member);
        
    }


}