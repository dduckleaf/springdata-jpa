package com.greedy.springdata.Authentication.service;



import com.greedy.springdata.Authentication.dto.CustomUser;
import com.greedy.springdata.member.dto.MemberDTO;
import com.greedy.springdata.member.entity.Member;
import com.greedy.springdata.member.repository.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final MemberRepository memberRepo;
    private final ModelMapper modelMapper;


    @Autowired
    public AuthenticationServiceImpl(MemberRepository memberRepo, ModelMapper modelMapper) {
        this.memberRepo = memberRepo;
        this.modelMapper = modelMapper;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Member member = memberRepo.findMemberByMemberId(username);
        System.out.println("member = " + member);System.out.println("member = " + member);System.out.println("member = " + member);System.out.println("member = " + member);

        List<GrantedAuthority> authorityList = new ArrayList<>();

        authorityList.add(new SimpleGrantedAuthority(member.getMemberRole()));



        return new CustomUser(modelMapper.map(member, MemberDTO.class), authorityList );
    }
}
