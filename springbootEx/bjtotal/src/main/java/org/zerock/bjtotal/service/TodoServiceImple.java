package org.zerock.bjtotal.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.bjtotal.dto.PageRequestDTO;
import org.zerock.bjtotal.dto.PageResponseDTO;
import org.zerock.bjtotal.dto.TodoDTO;
//import org.zerock.bjtotal.mappers.TimeMapper;
import org.zerock.bjtotal.mappers.TodoMapper;

import lombok.RequiredArgsConstructor;
//import lombok.extern.log4j.Log4j2;

@Service
//@Log4j2
@RequiredArgsConstructor
public class TodoServiceImple implements TodoService{
    
    //private final TimeMapper timeMapper; 기본적으로 시간 찍어보기.
    private final TodoMapper todoMapper;

    @Override
    public PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO) {

        List<TodoDTO> list = todoMapper.list(pageRequestDTO);
        long total = todoMapper.listCount(pageRequestDTO);

        return PageResponseDTO.<TodoDTO>withAll()
        .list(list)
        .total(total)
        .build();
    }

}
