package org.zerock.bjtotal.service;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.bjtotal.dto.PageRequestDTO;
import org.zerock.bjtotal.dto.PageResponseDTO;
import org.zerock.bjtotal.dto.TodoDTO;

@Transactional
public interface TodoService {
    
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

}
