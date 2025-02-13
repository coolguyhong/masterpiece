package com.pjsconsulting.masterpiece.service.dto.condition;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDTO {

    private int page;

    private int size;

    private String sortKey;

    private String sortOrder;


}
