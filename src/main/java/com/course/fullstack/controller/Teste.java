package com.course.fullstack.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/teste")
public class Teste {
    
    @GetMapping 
    String teste()  {
        
        
        return "teste";
    }
    
}
