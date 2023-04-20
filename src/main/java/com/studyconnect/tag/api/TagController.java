package com.studyconnect.tag.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studyconnect.tag.dto.Tag;
import com.studyconnect.tag.dto.TagRequestDto;
import com.studyconnect.tag.service.TagService;

@RestController
@RequestMapping(("/tag"))
public class TagController {

	private final TagService tagService;

	@Autowired
	public TagController(TagService tagService) {
		this.tagService = tagService;
	}

	@GetMapping
	public ResponseEntity<List<Tag>> getTags(@ModelAttribute TagRequestDto tagRequestDto) {

		List<Tag> tags = Optional.ofNullable(tagRequestDto.getCategories())
			.map(tagService::getTagsByCategories)
			.orElseGet(tagService::getTags);

		return ResponseEntity.ok(tags);
	}

}
