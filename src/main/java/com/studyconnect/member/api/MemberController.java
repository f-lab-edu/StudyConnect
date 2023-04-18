package com.studyconnect.member.api;

import com.studyconnect.member.dto.CreateMemberRequest;
import com.studyconnect.member.dto.CreateMemberResponse;
import com.studyconnect.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**LoginRequest Controller
 * The type LoginRequest controller.
 */
@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity<CreateMemberResponse> signUp(@Valid @RequestBody CreateMemberRequest request) {
        return ResponseEntity.ok(memberService.signUp(request));
    }

}
