package org.zerock.bj2.mappers;

import java.util.List;

import org.zerock.bj2.todo.dto.PageRequestDTO;
import org.zerock.bj2.todo.dto.TodoDTO;

public interface TodoMapper {
    
    int insert(TodoDTO TodoDTO);

    List<TodoDTO> list(PageRequestDTO pageRequestDTO);

    long listCount(PageRequestDTO pageRequestDTO);
}
