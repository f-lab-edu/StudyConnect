package studyconnect.member.dto;


import com.studyconnect.member.dto.LoginRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginRequestTest{

	@Test
	@DisplayName("LoginRequest 생성 테스트")
	public void test() {
		LoginRequest loginRequest = new LoginRequest("test", "test1234");
		String memberEmail = loginRequest.getMemberEmail();
		Assertions.assertEquals("test", memberEmail);
	}
}