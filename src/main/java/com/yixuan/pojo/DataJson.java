package com.yixuan.pojo;

import lombok.Data;

import java.util.Map;

@Data
public class DataJson {
    private Integer code;
    private String msg;
    private Map<String,String> data;
}
