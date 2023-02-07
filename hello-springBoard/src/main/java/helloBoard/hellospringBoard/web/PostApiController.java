package helloBoard.hellospringBoard.web;

import helloBoard.hellospringBoard.service.posts.PostsService;
import helloBoard.hellospringBoard.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor // Bean 주입 -> @AutoWired 대신 생성자로
public class PostApiController {
    private final PostsService postsService;

    @PostMapping("/saveForm/post") // 요청이 들어오면
    public Long save(@RequestBody PostsSaveRequestDto requestDto){ // dto에 내용 담겨 넘어와
        return postsService.save(requestDto); // postServcice의 save 메소드로 넘겨줌
    }
}
