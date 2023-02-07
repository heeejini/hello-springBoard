package helloBoard.hellospringBoard.service.posts;


import helloBoard.hellospringBoard.domain.posts.PostRepository;
import helloBoard.hellospringBoard.web.dto.PostsSaveRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostsService {
    private final PostRepository postRepository;

    @Transactional // 메소드 실행 시 트랙젝션 시작 ~ 정상종료 되면 커밋 / 에러시 롤백
    public Long save(PostsSaveRequestDto requestDto){
        return postRepository.save(requestDto.toEntity()).getId();
    }
}
