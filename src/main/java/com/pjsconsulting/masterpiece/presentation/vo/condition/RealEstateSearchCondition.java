package com.pjsconsulting.masterpiece.presentation.vo.condition;

import jakarta.validation.constraints.Pattern;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RealEstateSearchCondition extends SearchCondition {

    private final String buildingName;

    private final String detailAddress;

    @Pattern(regexp = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$", message = "yyyy-MM-dd 형식이어야 합니다.")
    private final String contractEndDateFrom;

    @Pattern(regexp = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$", message = "yyyy-MM-dd 형식이어야 합니다.")
    private final String contractEndDateTo;

    private final String ownerName;

    private final String buildingType;

}
