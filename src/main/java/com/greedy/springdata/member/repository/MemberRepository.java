package com.greedy.springdata.member.repository;


import com.greedy.springdata.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    Member findMemberByMemberId(String username);

}
