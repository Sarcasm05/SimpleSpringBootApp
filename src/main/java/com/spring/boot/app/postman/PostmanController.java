package com.spring.boot.app.postman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("postman")
public class PostmanController {

    private final PostmanService postmanService;

    @Autowired
    public PostmanController(PostmanService postmanService){
        this.postmanService = postmanService;
    }

    @GetMapping("/getPostmanData")
    public PostmanResponseDTO getPostmanData(@RequestParam(value = "foo1") String foo1,
                                                  @RequestParam(value = "foo2") String foo2){
        return postmanService.getResponseFromPostman(foo1, foo2);
    }
}
