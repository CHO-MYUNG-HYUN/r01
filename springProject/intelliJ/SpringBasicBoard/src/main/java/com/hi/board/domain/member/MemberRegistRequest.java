package com.hi.board.domain.member;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberRegistRequest {

    private String uid;
    private String uname;
    private String pw;
    private MultipartFile uphoto;
    private String fileName;
}
