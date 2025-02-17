package com.pjsconsulting.masterpiece.presentation.vo.response;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class RealEstatesResponse {

    private String id;

    private String ownerName;

    private String roadAddress;

    private String buildingName;

    private String detailAddress;

    private String buildingType;

    private String housingRentalBusinessYn;

    private String rentalType;

    private long deposit;

    private long monthlyRent;

    private String contractStartDate;

    private String contractEndDate;

    private String createdBy;

    private ZonedDateTime createdDt;

    private String modifiedBy;

    private ZonedDateTime modifiedDt;

}
