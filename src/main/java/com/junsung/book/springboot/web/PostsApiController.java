package com.junsung.book.springboot.web;

import com.junsung.book.springboot.service.posts.PostsService;
import com.junsung.book.springboot.web.dto.PostsResponseDto;
import com.junsung.book.springboot.web.dto.PostsSaveRequestDto;
import com.junsung.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor // 생성자 주입 (DI)
@RestController // 객체를 리턴해도 message converter를 통해 json으로 변경하여 리턴해 줌
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}
