package com.junsung.book.springboot.web.dto;

import com.junsung.book.springboot.domain.posts.Posts;
import lombok.Getter;

/**
 * PostsResponseDto는 Entity의 필드 중 일부만 사용하므로
 * 생성자를 통해 DB로부터 조회한 Entity를 받아 필드에 값을 넣음
 */
@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
