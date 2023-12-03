package com.shopping.musinsa.Member.respository;

import com.shopping.musinsa.Member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom{
}
