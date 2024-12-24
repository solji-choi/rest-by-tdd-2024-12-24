package com.ll.restByTdd.domain.member.member.dto;

import com.ll.restByTdd.domain.member.member.entity.Member;
import lombok.Getter;

import java.time.LocalDateTime;


@Getter
public class MemberDto {
    private long id;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    private String nickname;

    public MemberDto(Member member) {
        this.id = member.getId();
        this.createDate = member.getCreateDate();
        this.modifyDate = member.getModifyDate();
        this.nickname = member.getNickname();
    }
}

