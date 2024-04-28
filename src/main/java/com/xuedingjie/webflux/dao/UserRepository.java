package com.xuedingjie.webflux.dao;

import com.xuedingjie.webflux.entity.User;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Integer> {

    @Query("SELECT * FROM oc_user WHERE display_name = :displayName")
    Flux<User> findByDisplayName(String displayName);
}