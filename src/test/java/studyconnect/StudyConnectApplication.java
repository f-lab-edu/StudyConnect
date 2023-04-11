package studyconnect;

import static org.springframework.web.servlet.function.RequestPredicates.*;
import static org.springframework.web.servlet.function.RouterFunctions.*;

import java.net.URI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@SpringBootApplication
public class StudyConnectApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudyConnectApplication.class, args);
	}

	/**
	 * Swagger UI. 접속 경로 리다이렉트
	 * Router function.
	 *
	 * @return the router function
	 */
	@Bean
	RouterFunction<ServerResponse> routerFunction() {
		return route(GET("/swagger"), req ->
			ServerResponse.temporaryRedirect(URI.create("swagger-ui.html")).build());
	}

}
