package com.studyconnect.tag.service;

import org.junit.jupiter.api.BeforeEach;
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
	void tagMapperTest() {
		// getTags() 메소드가 호출될 때 captor로 전달된 인자를 캡처합니다.
		tagMapper.getTags().stream().map(Tag::getTagName).forEach(System.out::println);
	}
}
