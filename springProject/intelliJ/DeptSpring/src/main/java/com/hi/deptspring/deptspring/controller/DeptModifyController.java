package com.hi.deptspring.deptspring.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept/modify")
@Log4j2
public class DeptModifyController {

    @GetMapping
    public String getModifyForm() {
        log.info("GET  /dept/modify");
        return "dept/modifyForm";
    }

    @PostMapping
    public String modify() {
        log.info("POST  /dept/modify");
        return "redirect:/dept/list";
    }
}
