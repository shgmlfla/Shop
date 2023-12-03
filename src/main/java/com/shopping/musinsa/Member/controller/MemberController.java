package com.shopping.musinsa.Member.controller;

import com.shopping.musinsa.Member.entity.Member;
import com.shopping.musinsa.Member.respository.MemberRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/selectAll")
    public List<Member> getMember() {
        return memberRepository.getMember(new Member());
    }

}
