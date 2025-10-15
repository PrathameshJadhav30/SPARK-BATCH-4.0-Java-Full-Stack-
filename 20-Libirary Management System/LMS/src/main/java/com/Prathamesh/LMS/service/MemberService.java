package com.Prathamesh.LMS.service;

import com.Prathamesh.LMS.entity.Member;
import com.Prathamesh.LMS.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository repo;
    public MemberService(MemberRepository repo) { this.repo = repo; }

    public List<Member> getAll() { return repo.findAll(); }
    public Member save(Member m) { return repo.save(m); }
}
