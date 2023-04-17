package com.studyconnect.member.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * LoginRequest Domain
 * The type LoginRequest.
 */
@Getter
@RequiredArgsConstructor
public class LoginRequest {
	private String memberEmail;
	private String password;

	public LoginRequest(String memberEmail, String password) {
		this.memberEmail = memberEmail;
		this.password = password;
	}
}
