package com.zhanglin.networkSlicingBackend.ms.model;

import lombok.Data;

@Data
public class CreateTerminalRequest{
        private String terminal_id;
        private String name;
        private String type;
}
