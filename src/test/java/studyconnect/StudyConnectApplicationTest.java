package studyconnect;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.studyconnect.StudyConnectApplication;

@SpringBootTest(classes = StudyConnectApplication.class)
class StudyConnectApplicationTest {
	@Test
	@DisplayName("Spring boot Start Test")
	void contextLoads() {
		System.out.println("Spring boot Start Test");
	}
}
