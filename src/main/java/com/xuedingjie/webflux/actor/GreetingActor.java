package com.xuedingjie.webflux.actor;

import akka.actor.UntypedActor;
import com.xuedingjie.webflux.entity.User;
import com.xuedingjie.webflux.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//public class GreetingActor extends AbstractBehavior<User> {
//
//    public static Behavior<User> create() {
//        return Behaviors.setup(GreetingActor::new);
//    }
//
//    private GreetingActor(ActorContext<User> context) {
//        super(context);
//    }
//
//    @Override
//    public Receive<User> createReceive() {
//        // 一个入口监听多个事件
//        return newReceiveBuilder()
//                .onMessage(User.class, this::onGreet)
//                .onMessage(User.class, this::onGoodbye)
//                .build();
//    }
//
//    private Behavior<User> onGreet(User command) {
//        getContext().getLog().info("Hello, {}", command.getDisplayName());
//        return this;
//    }
//
//    private Behavior<User> onGoodbye(User command) {
//        getContext().getLog().info("Goodbye, {}", command.getDisplayName());
//        return this;
//    }
//}
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GreetingActor extends UntypedActor {

    @Resource
    private IUserService userService;

    @Override
    public void onReceive(Object message) throws Throwable {
        if (message instanceof User) {
            String name = ((User) message).getDisplayName();
            getSender().tell(userService.sayHello(name), getSelf());
        } else {
            unhandled(message);
        }
    }
}