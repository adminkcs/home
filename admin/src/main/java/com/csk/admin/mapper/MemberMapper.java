package com.csk.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.csk.admin.vo.MemberVO;

public interface MemberMapper {

	@Select("select * from member_tb")
	public List<MemberVO> getMemberList();
}
