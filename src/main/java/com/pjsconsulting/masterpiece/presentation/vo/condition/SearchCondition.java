package com.pjsconsulting.masterpiece.presentation.vo.condition;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class SearchCondition {

    private int page = 0;

    @Min(value = 1, message = "최소 1건 이상 조회해야 합니다.")
    @Max(value = 10000, message = "최대 10000건까지 조회해야 합니다.")
    private int size = 10;

    private String sortKey;

    private String sortOrder;

}
