package com.pjsconsulting.masterpiece.persistence.domain;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class RealEstateDomain {

    private String id;

    private String ownerName;

    private String roadAddress;

    private String parcelAddress;

    private String postcode;

    private String buildingName;

    private String detailAddress;

    private String buildingType;

    private double supplyArea;

    private double exclusiveArea;

    private String purchaseDate;

    private long purchasePrice;

    private long kbMarketPrice;

    private long techMarketPrice;

    private long publicMarketPrice;

    private String rentalType;

    private long deposit;

    private long monthlyRent;

    private String contractStartDate;

    private String contractEndDate;

    private String housingRentalBusinessYn;

    private String housingRentalType;

    private String housingRentalStartDate;

    private String housingRentalDutyEndDate;

    private String createdBy;

    private ZonedDateTime createdDt;

    private String modifiedBy;

    private ZonedDateTime modifiedDt;

}
