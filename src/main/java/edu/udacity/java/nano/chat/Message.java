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

    private MessageType messageType;        // The type of the message
    private  String username;                   // The username of the sender
    private String message;                 // The message body
    private int onlineCount;                // Sessions counter

    public Message(MessageType messageType, String username, String message, int onlineCount) {
        this.messageType = messageType;
        this.username = username;
        this.message = message;
        this.onlineCount = onlineCount;
    }

    // Take a JSON as input and return a String
    public static String jsonToStr(MessageType messageType, String username, String message, int onlineTotal) {
        return JSON.toJSONString(new Message(messageType,username,message,onlineTotal));
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(int onlineCount) {
        this.onlineCount = onlineCount;
    }
}



























