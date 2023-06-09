package org.zerock.bjtotal.mappers;

import java.util.List;

import org.zerock.bjtotal.dto.PageRequestDTO;
import org.zerock.bjtotal.dto.TodoDTO;

public interface TodoMapper {
    
    int insert(TodoDTO todoDTO);

    List<TodoDTO> list(PageRequestDTO pageRequestDTO);

    long listCount(PageRequestDTO pageRequestDTO);

}
