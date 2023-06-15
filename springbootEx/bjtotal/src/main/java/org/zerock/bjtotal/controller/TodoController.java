package org.zerock.bjtotal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.bjtotal.dto.PageRequestDTO;
import org.zerock.bjtotal.dto.PageResponseDTO;
import org.zerock.bjtotal.dto.TodoDTO;
import org.zerock.bjtotal.service.TodoService;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequiredArgsConstructor
@RequestMapping("/todo/")
@Log4j2
public class TodoController {
    
    private final TodoService todoService;

       // list
       @GetMapping("list")
       public void list(PageRequestDTO pageRequestDTO, Model model){
           log.info("list");

           PageResponseDTO<TodoDTO> pageResponseDTO = todoService.getList(pageRequestDTO);

           model.addAttribute("pageResponseDTO",pageResponseDTO);

       }

       
       @GetMapping("read/{tno}")
       public String read(
            @PathVariable("tno") long tno,
            PageRequestDTO pageRequestDTO,
            Model model
        ){

        log.info("read..........");
        log.info(tno);

        TodoDTO todoDTO = TodoDTO.builder()
        .tno(tno)
        .title("Sample...")
        .writer("user122")
        .dueDate("2023-06-14")
        .build();

        model.addAttribute("todo", todoDTO);

        return "todo/read";
       }
   

    
 

}
