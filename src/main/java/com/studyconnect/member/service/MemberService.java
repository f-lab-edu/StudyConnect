package com.studyconnect.member.service;

import com.studyconnect.member.dto.CreateMemberRequest;
import com.studyconnect.member.dto.CreateMemberResponse;
import com.studyconnect.member.mapper.MemberMapper;
import org.springframework.stereotype.Service;

/**LoginRequest Service
 * The type LoginRequest service.
 */
@Service
public class MemberService {

    private final MemberMapper memberMapper;
//    private final MemberPasswordEncoder memberPasswordEncoder;


    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public CreateMemberResponse signUp(CreateMemberRequest request) {

        return null;
    }
}
