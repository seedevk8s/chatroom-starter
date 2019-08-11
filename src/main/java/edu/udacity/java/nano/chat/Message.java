package edu.udacity.java.nano.chat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * WebSocket message model
 */
public class Message {

    // Define the three possible kind of messages
    public static enum MessageType {
        ENTER,
        SPEAK,
        LEAVE
    }

    @JSONField(name = "username")
    private  String name;                   // The username of the sender

    @JSONField(name = "msg")
    private String message;                 // The message body

    private MessageType messageType;        // The type of the message
    private int onlineCount;                // Sessions counter

    public Message() {
    }

    public Message(String name, String message, MessageType messageType, int onlineCount) {
        this.name = name;
        this.message = message;
        this.messageType = messageType;
        this.onlineCount = onlineCount;
    }

    // Take a JSON as input and return a String
    public static String jsonToStr(String username, String msg, MessageType type, int onlineCount) {
        return JSON.toJSONString(new Message(username, msg, type, onlineCount));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public int getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(int onlineCount) {
        this.onlineCount = onlineCount;
    }
}



























