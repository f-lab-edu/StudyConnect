package com.studyconnect.tag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.studyconnect.tag.dto.Tag;

@Mapper
public interface TagMapper {
	List<Tag> getTags();
}

