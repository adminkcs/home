package com.csk.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.csk.admin.mapper.MemberMapper;
import com.csk.admin.vo.MemberVO;

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberMapper memberMapper;
	
	@RequestMapping(value = "/members", method = RequestMethod.GET)
    public String memberList(Model model) {
		
		List<MemberVO> member = memberMapper.getMemberList();
		System.out.println(member);
		model.addAttribute("member", member);
        return "member/memberView";
    }
}
