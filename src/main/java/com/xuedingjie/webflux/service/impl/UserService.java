package com.xuedingjie.webflux.service.impl;

import com.xuedingjie.webflux.dao.UserRepository;
import com.xuedingjie.webflux.entity.User;
import com.xuedingjie.webflux.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * <p>description: </p>
 * <p>version: 1.0 </p>
 * <p>author: xuedingjie </p>
 * <p>mail: xuedingjie4566@ienglish.com </p>
 * <p>date: 2024/4/16 13:25 </p>
 */
@Service
public class UserService implements IUserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public Flux<User> sayHello(String name) {
        return userRepository.findByDisplayName(name);
    }

    @Override
    public Mono<User> findById(Integer id) {
        return userRepository.findById(id);
    }
}