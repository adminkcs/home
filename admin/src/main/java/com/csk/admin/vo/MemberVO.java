package com.csk.admin.vo;

import lombok.Data;

@Data
public class MemberVO {

	int user_no;
	String user_id;
	String name;
	String password;
	String email;
	String email_yn;
	String hp_no;
	String sms_yn;
	String author_cd;
	String reg_dt;
	String mod_dt;
	String mod_user_id;
	String mod_password_dt;
}

