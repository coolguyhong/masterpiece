package com.pjsconsulting.masterpiece.presentation.vo.condition;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RealEstateSearchCondition extends SearchCondition {

    private final String buildingName;

    private final String detailAddress;

    private final String contractEndDtFrom;

    private final String contractEndDtTo;

    private final String ownerName;

    private final String buildingType;

}
