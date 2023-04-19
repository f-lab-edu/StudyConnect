package com.studyconnect.tag.service;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.studyconnect.tag.dto.Tag;
import com.studyconnect.tag.mapper.TagMapper;

@ExtendWith(MockitoExtension.class)
class TagServiceTest {
	private TagService tagService;

	@Mock
	private TagMapper tagMapper;

	@BeforeEach
	void setUp() {
		tagService = new TagService(tagMapper);
	}

	@Test
	@DisplayName("태그 목록 전체 조회")
	void tagMapperTest() {
		List<Tag> tags = tagService.getTags();
		tags.forEach(System.out::println);
	}
}
