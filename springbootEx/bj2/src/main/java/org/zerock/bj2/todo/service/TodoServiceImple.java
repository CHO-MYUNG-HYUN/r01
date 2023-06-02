package org.zerock.bj2.todo.service;

import org.springframework.stereotype.Service;
import org.zerock.bj2.mappers.TimeMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImple implements TodoService  {

    private final TimeMapper timeMapper;
    
}
