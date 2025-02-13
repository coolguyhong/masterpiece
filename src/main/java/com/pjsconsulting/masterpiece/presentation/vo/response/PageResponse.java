package com.pjsconsulting.masterpiece.presentation.vo.response;

import lombok.Data;

import java.util.List;

@Data
public class PageResponse<T> {

    private int totalCount;

    private List<T> contents;
}
