package com.spring.boot.app.controller;

import com.spring.boot.app.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("math")
public class MathController {
    private final MathService mathService;

    @Autowired
    public MathController(MathService mathService){
        this.mathService = mathService;
    }

    @GetMapping("/getFibonachiForUser")
    public String getFibonachiForUser(@RequestParam(value = "username") String username,
                                      @RequestParam(value = "fibonachiNumber") Integer fibonachiNumber) {
        return mathService.getFibonachiForUser(username, fibonachiNumber);
    }
}
