package com.xuedingjie.webflux.config.akka;

import akka.actor.ActorSystem;
import jakarta.annotation.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class AkkaConfiguration {

    public static final String ACTOR_SYSTEM = "akka-spring-demo";
    public static final String GREETING_ACTOR = "greetingActor";
    @Resource
    private ApplicationContext applicationContext;

    private ActorSystem actorSystem;

    @Bean
    public ActorSystem actorSystem() {
        actorSystem = ActorSystem.create(ACTOR_SYSTEM);
        SpringExtension.SPRING_EXTENSION_PROVIDER.get(actorSystem).initialize(applicationContext);
        return actorSystem;
    }

//    @Bean(name = GREETING_ACTOR)
//    @DependsOn({ACTOR_SYSTEM})
//    public ActorRef loginActor() {
//        SpringActorProducer producer = new SpringActorProducer(applicationContext, GREETING_ACTOR);
//        return actorSystem.actorOf(Props.create(SpringActorProducer.class, producer), GREETING_ACTOR);
////        return actorSystem
////                .actorOf(SPRING_EXTENSION_PROVIDER.get(actorSystem).props("greetingActor"), GREETING_ACTOR);
//    }
}