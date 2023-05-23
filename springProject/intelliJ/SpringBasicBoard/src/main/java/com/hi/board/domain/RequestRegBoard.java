package com.hi.board.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RequestRegBoard {

    private String title;
    private String content;
    // 회원제 게시판 작성자는 memidx로 변경,
    private String memidx;
    //private String writer;
    // 파일 업로드를 위해서 변수 추가
    private MultipartFile file; // 사용자로 부터 받는 파일 객체
    private String filename; // DB에 저장할 File 이름

}
