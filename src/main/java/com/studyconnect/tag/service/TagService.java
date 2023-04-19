package com.studyconnect.tag.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.studyconnect.tag.dto.Tag;
import com.studyconnect.tag.mapper.TagMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TagService {

	private final TagMapper tagMapper;

	@Cacheable("tags")
	public List<Tag> getTags() {
		return tagMapper.getTags();
	}

	public List<Tag> getTagsByCategories(List<String> categories) {
		return tagMapper.getTagsWithCategories(categories);
	}
}
