package org.javaexercises.app_q1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class AppQ1Controller {

    @GetMapping("/status")
    public String status() {
        log.info("O serviço está ativo!");
        return "O serviço está ativo!";
    }
}
