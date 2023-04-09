package com.studyconnect.member.dto;

import lombok.Getter;

/**LoginRequest Domain
 * The type LoginRequest.
 */
@Getter
public class LoginRequest {
	private String email;
	private String password;
}