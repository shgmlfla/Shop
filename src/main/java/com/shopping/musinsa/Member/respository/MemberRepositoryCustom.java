package com.shopping.musinsa.Member.respository;

import com.shopping.musinsa.Member.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {

    List<Member> getMember(Member member);
}
