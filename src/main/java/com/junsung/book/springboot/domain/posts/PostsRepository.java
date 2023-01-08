package com.junsung.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * - JpaRepository를 상속 받으면 의존성 주입 및 빈 등록을 위해 @Repository를 사용할 필요 X
 * - spring-data-jpa의 repository 빈 등록은 @EnableJpaRepositories 어노테이션에서 이루어지는데,
 *   SpringBoot에서는 자동 설정되어 생략 되어 있음
 */
public interface PostsRepository extends JpaRepository<Posts, Long> { 

}
