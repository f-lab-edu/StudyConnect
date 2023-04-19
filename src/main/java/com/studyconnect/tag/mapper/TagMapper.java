package com.studyconnect.tag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.studyconnect.tag.dto.Tag;

@Mapper
@Repository
public interface TagMapper {

	List<Tag> getTags();

	List<Tag> getTagsWithCategories(List<String> categories);
}

