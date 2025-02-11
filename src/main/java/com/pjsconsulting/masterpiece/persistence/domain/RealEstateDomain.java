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

    private String housingRentalBusinessYn;

    private String housingRentalType;

    private String housingRentalStartDt;

    private String housingRentalDutyEndDt;

    private String createdBy;

    private ZonedDateTime createdDt;

    private String modifiedBy;

    private ZonedDateTime modifiedDt;

}
