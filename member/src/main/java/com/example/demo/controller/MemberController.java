package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Member;
import com.example.demo.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	//전체보기
	@GetMapping("/list")
	public List<Member>list(){
		return memberService.list();
	}
	//추가
	@PostMapping("/insert")
	public Member insert(@RequestBody Member member) {
		return memberService.insert(member);
	}
}
