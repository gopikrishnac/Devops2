package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController
public class HelloController{
@GetMapping("/") public String hello(){return "Hello from DevOps GitOps Pipeline!";}
@GetMapping("/health") public String health(){return "Application Running Successfully";}
}