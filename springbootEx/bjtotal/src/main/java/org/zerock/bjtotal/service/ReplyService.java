package org.zerock.bjtotal.service;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.bjtotal.dto.PageRequestDTO;
import org.zerock.bjtotal.dto.PageResponseDTO;
import org.zerock.bjtotal.dto.ReplyDTO;

@Transactional
public interface ReplyService {
    
    Long register(ReplyDTO replyDTO);

    PageResponseDTO<ReplyDTO> getList(Long tno, PageRequestDTO pageRequestDTO);

    ReplyDTO getOne(Long tno);
    
}
