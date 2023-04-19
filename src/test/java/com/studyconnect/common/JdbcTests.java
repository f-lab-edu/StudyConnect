package com.studyconnect.common;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;

@JdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class JdbcTests {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	@DisplayName("DB 연결 검증")
	public void testQuery() {
		//데이타소스가 없으면 jdbcTemplate가 생성되지 않아 오류가 발생합니다
		assertNotNull(jdbcTemplate);
	}
}
