package com.xuedingjie.webflux.controller;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.util.Timeout;
import com.xuedingjie.webflux.config.akka.SpringExtension;
import com.xuedingjie.webflux.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.FiniteDuration;

import java.util.concurrent.TimeUnit;


@RestController
public class GreetingController {

    private final ActorRef greeter;

    public GreetingController(ActorSystem system) {
        greeter =
                system.actorOf(
                        SpringExtension.SPRING_EXTENSION_PROVIDER.get(system).props("greetingActor"),
                        "greeter");
    }

    @GetMapping("/greet")
    public Mono<String> greet(@RequestParam(value = "name", defaultValue = "World") String name) throws Exception {
        User user = new User();
        user.setDisplayName(name);
        FiniteDuration duration = FiniteDuration.create(1, TimeUnit.SECONDS);
        Timeout timeout = Timeout.durationToTimeout(duration);
        Future<Object> result = akka.pattern.Patterns.ask(greeter, user, 0L);
        Object object = Await.result(result, duration);
        return Mono.just(object.toString());
    }
}