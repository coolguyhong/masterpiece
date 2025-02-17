package com.pjsconsulting.masterpiece.presentation.vo.response;

import lombok.Getter;

import java.util.List;

@Getter
public class PageResponse<T> {

    private int totalCount;

    private List<T> contents;

    public PageResponse(int totalCount, List<T> contents) {
        this.totalCount = totalCount;
        this.contents = contents;
    }
}
