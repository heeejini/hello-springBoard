package helloBoard.hellospringBoard.domain.posts;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor // 기본 생성자 자동 추가 == public Posts{}
@Getter // getter 메소드 자동 추가
@Entity
//엔티티 클래스 자체가 테이블이라고 생각하면 됨
public class Posts {

 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // PK > auto increment
 @Column(length = 500 , nullable = false) // varchar(255)가 기본 > 500으로 늘려줌
    private String title ;
 @Column(columnDefinition = "TEXT", nullable=false) // > type을 텍스트로 바꿔줌
    private String content;

 private String author;

 /*
 생성자를 빠르게 생성하는 단축키 : alt+insert
 entity 클래스에서는 setter 메소드를 만드는 것보다
 값 변경이 필요하면 @Builder 를 통해 그에 관한 메소드를 추가하는 방법을 지향한다.

  */
 @Builder // 빌더 클래스 자동 생성 > 생성자 대신 사용
    public Posts(String title, String content, String author){
     this.title = title;
     this.content = content;
     this.author = author ;

 }
}
