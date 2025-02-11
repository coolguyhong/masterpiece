package com.pjsconsulting.masterpiece.presentation.vo.response;

import lombok.Getter;

@Getter
public class CommonResponse {

    private final String id;

    public CommonResponse(String id) {
        this.id = id;
    }
}
