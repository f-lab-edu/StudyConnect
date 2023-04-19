package com.studyconnect.tag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studyconnect.tag.dto.Tag;
import com.studyconnect.tag.mapper.TagMapper;

@Service
public class TagService {

	private final TagMapper tagMapper;

	@Autowired
	public TagService(TagMapper tagMapper) {
		this.tagMapper = tagMapper;
	}

	public List<Tag> getTags() {
		return tagMapper.getTags();
	}

}
