package com.ll.restByTdd.domain.member.member.controller;

import com.ll.restByTdd.domain.member.member.service.MemberService;
import com.ll.restByTdd.global.rsData.RsData;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
public class ApiV1MemberController {
    private final MemberService memberService;

    record MemberJoinReqBody(
            @NotBlank
            @Length(min = 4)
            String username,
            @NotBlank
            @Length(min = 4)
            String password,
            @NotBlank
            @Length(min = 2)
            String nickname
    ) {
    }

    @PostMapping("/join")
    public RsData<Void> join() {
        return new RsData<>(
                "201-1",
                "무명님 환영합니다."
        );
    }
}
