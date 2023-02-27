package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/mesaj")
public class merhaba {
    @GetMapping
    public String merhaba(){

        return "merhaba";
    }
}
