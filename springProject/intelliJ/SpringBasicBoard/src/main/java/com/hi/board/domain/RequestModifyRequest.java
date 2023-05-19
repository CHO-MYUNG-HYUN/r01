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
public class RequestModifyRequest {

    private int bno;
    private String title;
    private String content;
    private String writer;
    private String oldfile;
    private MultipartFile file;
    private String filename;
}
