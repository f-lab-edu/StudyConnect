package studyconnect.member.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;

/**LoginRequest Domain
 * The type LoginRequest.
 */
@Getter
@Alias("LoginRequest")
public class LoginRequest {
	private String email;
	private String password;
}