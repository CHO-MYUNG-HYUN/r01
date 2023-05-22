package com.hi.board.service.memeber;

import com.hi.board.domain.member.MemberRegistRequest;
import com.hi.board.mapper.MemberMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Service
@Log4j2
public class MemberRegistService {

    @Autowired
    private MemberMapper memberMapper;

    // MemberRegistRequest 객체를 받고 Request를 받고
    public int registMember(
            MemberRegistRequest registRequest,
            HttpServletRequest request
    ) {
        // 첨부파일이 있으면 파일 저장
        if (registRequest.getUphoto() != null && registRequest.getUphoto().getSize() > 0) {
            //저장 uri => 폴더
            String uri = "/uploadfile/member";
            //실제 경로
            String realPath = request.getSession().getServletContext().getRealPath(uri);
            // 새로운 파일 이름 생성
            String newFileName = registRequest.getUid()
                    + "-" + registRequest.getUphoto().getOriginalFilename();


            // 저장
            File newfile = new File(realPath, newFileName);
            try {
                registRequest.getUphoto().transferTo(newfile);
                // filename 에 새로운 파일 이름을 저장
                registRequest.setFileName(newFileName);
            } catch (IOException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
        log.info(">>> service : registRequest => " +registRequest);
        // mapper insert 요청
        return memberMapper.insertMember(registRequest);
    }
}
