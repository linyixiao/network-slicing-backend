package com.zhanglin.networkSlicingBackend.ms.entity;

import lombok.Data;

@Data
public class Slice {
    private String slice_id;
    private String name;
    private String create_time;
    private String nodeList;
    private String priority;
    private String status;
}
