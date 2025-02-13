package com.pjsconsulting.masterpiece.service.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class RealEstateResDTO {

    private String id;

    private String ownerName;

    private String roadAddress;

    private String buildingName;

    private String detailAddress;

    private String buildingType;

    private String housingRentalBusinessYn;

    private long deposit;

    private long monthlyRent;

    private String createdBy;

    private ZonedDateTime createdDt;

    private String modifiedBy;

    private ZonedDateTime modifiedDt;

}
