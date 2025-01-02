package com.ll.restByTdd.domain.post.post.controller;

import com.ll.restByTdd.domain.member.member.entity.Member;
import com.ll.restByTdd.domain.post.post.dto.PostDto;
import com.ll.restByTdd.domain.post.post.entity.Post;
import com.ll.restByTdd.domain.post.post.service.PostService;
import com.ll.restByTdd.global.rq.Rq;
import com.ll.restByTdd.global.rsData.RsData;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
@RequiredArgsConstructor
public class ApiV1PostController {
    private final PostService postService;
    private final Rq rq;

    @GetMapping("/{id}")
    public PostDto item(@PathVariable long id) {
        return new PostDto(postService.findById(id).get());
    }

    record PostWriteReqBody(
            @NotBlank
            String title,

            @NotBlank
            String content
    ) {}

    @PostMapping("/write")
    public RsData<PostDto> write(
            @RequestBody @Valid PostWriteReqBody reqBody
    ) {
        Member author = rq.checkAuthentication();

        Post post = postService.write(author, reqBody.title, reqBody.content);

        return new RsData<>(
                "201-1",
                "%d번 글이 작성되었습니다.".formatted(post.getId()),
                new PostDto(post)
        );
    }
}