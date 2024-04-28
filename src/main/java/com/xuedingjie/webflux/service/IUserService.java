package com.xuedingjie.webflux.service;

import com.xuedingjie.webflux.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * <p>description: </p>
 * <p>version: 1.0 </p>
 * <p>author: xuedingjie </p>
 * <p>mail: xuedingjie4566@ienglish.com </p>
 * <p>date: 2024/4/16 13:25 </p>
 */
public interface IUserService {
    Flux<User> sayHello(String name);
    Mono<User> findById(Integer id);
}