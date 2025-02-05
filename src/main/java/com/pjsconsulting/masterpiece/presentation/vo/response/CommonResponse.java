package com.pjsconsulting.masterpiece.presentation.vo.response;

import java.io.Serial;
import java.io.Serializable;

@Serial
public class CommonResponse implements Serializable {

    private final String id;

    public CommonResponse(String id) {
        this.id = id;
    }
}
