package com.studyconnect.tag.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class TagRequestDto {
	private final List<String> categories;

	public TagRequestDto(List<String> categories) {
		this.categories = categories;
	}
}
