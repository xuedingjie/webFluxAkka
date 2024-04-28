package com.xuedingjie.webflux.controller;

import com.xuedingjie.webflux.entity.User;
import com.xuedingjie.webflux.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @Resource
    private IUserService userService;

    @GetMapping("/hello")
    public Flux<User> hello() {
        var si = "";
        return userService.sayHello("薛丁滐");
    }

    @GetMapping("/id/{id}")
    public Mono<User> findById(@PathVariable Integer id) {
        return userService.findById(id);
    }
}