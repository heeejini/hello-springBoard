package helloBoard.hellospringBoard.web.dto;


import helloBoard.hellospringBoard.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
// dto 는 직접 화면에서 받고 넘기는 객체들이다.
@NoArgsConstructor // 기본생성자 자동 추가 == public Posts{}
@Getter // getter 메소드 자동 추가
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder

    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content=content;
        this.author=author;
    }

    // Dto에서 필요한 부분을 entity 화 시킴

    public Posts toEntity()
    {
        return Posts.builder().
                title(title).
                content(content).
                author(author).build();
    }
}
