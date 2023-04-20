package com.studyconnect.tag.dto;

import lombok.Getter;

import java.util.List;


@Getter
public class TagRequestDto{
    private final List<String> categories;

    public TagRequestDto(List<String> categories) {
        this.categories = categories;
    }
}
