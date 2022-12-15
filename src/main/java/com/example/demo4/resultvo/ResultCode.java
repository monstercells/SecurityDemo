package com.example.demo4.resultvo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ResultCode {
    //成功返回结果
    SERVICE_OK(200,"成功！"),
    //返回失败结果
    SERVICE_ERR(201,"失败");
    private int code;
    private String msg;
}