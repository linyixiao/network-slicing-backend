package com.zhanglin.networkSlicingBackend.ms.entity;

import lombok.Data;

@Data
public class Terminal {
    private String terminal_id;
    private String name;
    private String type;
    private String selected_slice;

}
