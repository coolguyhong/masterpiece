package com.pjsconsulting.masterpiece.service.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RealEstateCreateReqDTO {

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

    private boolean isHousingRentalBusiness;

    private String housingRentalType;

    private String housingRentalStartDate;

    private String housingRentalDutyEndDate;

}
