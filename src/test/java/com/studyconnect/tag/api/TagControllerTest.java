package com.studyconnect.tag.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TagController.class)
class TagControllerTest {

	@Autowired
	MockMvc mvc;

	@Test
	@DisplayName("태그목록 요청 테스트")
	void getTags() throws Exception {
		//given

		//when

		//then
		mvc.perform(get("/tag"))
			.andExpect(status().isOk());
	}

}