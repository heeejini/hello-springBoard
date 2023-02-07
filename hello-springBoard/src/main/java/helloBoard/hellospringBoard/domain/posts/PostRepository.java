package helloBoard.hellospringBoard.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long> { // 데이터 베이스 접근 하는 애
    // 실제로 db에 넣는 거 > service 가 repository 함수 실행시켜서 원하는 값 넣기
    // entity에 의해 생성된 DB에 접근하는 메서드들을 사용하기 위한 인터페이스

    // JpaRepository<Entity 클래스 , PK 타입>을 상속 받으면 기본 CRUD 메소드가 자동 생성된다는 장점이 존재


}
