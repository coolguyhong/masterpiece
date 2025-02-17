package com.pjsconsulting.masterpiece.service.dto.condition;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RealEstateSearchDTO extends SearchDTO {

    private String buildingName;

    private String detailAddress;

    private String contractEndDateFrom;

    private String contractEndDateTo;

    private String ownerName;

    private String buildingType;

}
