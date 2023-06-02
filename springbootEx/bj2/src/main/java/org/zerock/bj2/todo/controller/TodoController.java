package org.zerock.bj2.todo.controller;

import org.springframework.stereotype.Controller;
import org.zerock.bj2.todo.service.TodoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TodoController  implements TodoService{
    
    private final TodoService todoService;
}
