package com.studyconnect.member.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.studyconnect.member.dto.LoginRequest;

@Mapper
public interface MemberMapper {
	void login(LoginRequest loginRequest);
}
