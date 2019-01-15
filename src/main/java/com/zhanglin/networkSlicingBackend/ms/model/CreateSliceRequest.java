package com.zhanglin.networkSlicingBackend.ms.model;

import lombok.Data;

@Data
public class CreateSliceRequest {
    private String slice_id;
    private String name;
    private String priority;
    private String status;
}
