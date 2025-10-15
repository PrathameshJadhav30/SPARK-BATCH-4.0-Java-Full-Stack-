package com.Prathamesh.LMS.controller;

import com.Prathamesh.LMS.entity.Member;
import com.Prathamesh.LMS.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@CrossOrigin(origins = "*")
public class MemberController {

    private final MemberService service;
    public MemberController(MemberService service) { this.service = service; }

    @GetMapping
    public List<Member> getAll() { return service.getAll(); }

    @PostMapping
    public Member add(@RequestBody Member m) { return service.save(m); }
}
