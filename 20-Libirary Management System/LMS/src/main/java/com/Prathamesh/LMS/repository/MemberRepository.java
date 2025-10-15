package com.Prathamesh.LMS.repository;

import com.Prathamesh.LMS.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> { }
