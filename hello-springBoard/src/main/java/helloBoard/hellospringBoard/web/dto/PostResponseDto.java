package helloBoard.hellospringBoard.web.dto;

import helloBoard.hellospringBoard.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostResponseDto(Posts entity){
        // 조회시 사용할 dto를 만들어준다
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content=entity.getContent();
        this.author = entity.getAuthor();

    }
}
