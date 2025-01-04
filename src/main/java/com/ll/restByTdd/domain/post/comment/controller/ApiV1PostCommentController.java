package com.ll.restByTdd.domain.post.comment.controller;

import com.ll.restByTdd.domain.member.member.entity.Member;
import com.ll.restByTdd.domain.post.comment.dto.PostCommentDto;
import com.ll.restByTdd.domain.post.post.service.PostService;
import com.ll.restByTdd.global.rq.Rq;
import com.ll.restByTdd.standard.page.dto.PageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts/{postId}/comments")
@RequiredArgsConstructor
public class ApiV1PostCommentController {
    private final PostService postService;
    private final Rq rq;

    @GetMapping
    public PageDto<PostCommentDto> items (
            @PathVariable long postId
    ) {
        Member author = rq.checkAuthentication();

        return null;
    }

}
