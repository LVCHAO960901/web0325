package com.neuedu.util;

import lombok.Data;

@Data
public class Message {
    private Integer code;
    private Object message;

    public Message(Integer code, Object message) {
        this.code = code;
        this.message = message;
    }
}
