package com.shopping.musinsa.Member.respository;

import com.querydsl.jpa.JPQLQueryFactory;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.shopping.musinsa.Member.entity.Member;
import com.shopping.musinsa.Member.entity.QMember;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Member> getMember(Member member){
        QMember qmember = QMember.member;
        return jpaQueryFactory
                .selectFrom(qmember)
                .fetch();
    }
}
