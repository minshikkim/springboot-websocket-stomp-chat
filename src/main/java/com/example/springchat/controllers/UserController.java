package com.example.springchat.controllers;

import com.example.springchat.model.Message;
import com.example.springchat.model.User;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {


    @MessageMapping("/user") // 최초로 오는 사용자들을 받습니다.
    public void StoreUser(User user){
        System.out.println(user.getName());
    }

    @MessageMapping("/topic/user/{userid}") // 매핑되는 곳
    @SendTo("/topic/user/{userid}") // 이 토픽을 구독하고 있는 모든 클라이언트에게 메시지를 보낸다.
    public Message sendToUser(@DestinationVariable String userid, Message message) {
        System.out.println(message.toString());
        Message msg = new Message(message.getId(), message.getMessage());
        return msg;
    }

}
