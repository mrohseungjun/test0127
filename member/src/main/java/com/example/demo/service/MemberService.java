package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
	
	//전체보기
	public List<Member>list(){
		return memberRepository.findAll();
		
	}
	//추가
	public Member insert(Member member) {
		return memberRepository.save(member);
	}
}
