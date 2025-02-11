package com.pjsconsulting.masterpiece.presentation.vo.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RealEstateCreateRequest {

    @NotBlank(message = "소유주는 필수값 입니다.")
    @Size(min = 1, max = 10, message="소유주는 최소 1자리 이상 최대 10자리 이하이어야 합니다.")
    @Pattern(regexp = "^[가-힣]*$", message = "한글만 입력할 수 있습니다.")
    private String ownerName;

    @NotBlank(message = "도로명 주소는 필수값 입니다.")
    private String roadAddress;

    @NotBlank(message = "지번 주소는 필수값 입니다.")
    private String parcelAddress;

    @NotBlank(message = "우편번호는 필수값 입니다.")
    @Pattern(regexp = "^[0-9]{5}$", message = "5자리 숫자만 입력할 수 있습니다.")
    private String postcode;

    @NotBlank(message = "물건명 필수값 입니다.")
    private String buildingName;

    @NotBlank(message = "상세 주소는 필수값 입니다.")
    @Size(min = 1, max = 30, message="상세 주소는 최소 1자리 이상 최대 30자리 이하이어야 합니다.")
    @Pattern(regexp = "^[가-힣a-zA-Z0-9\\s~&()_-]*$", message = "허용되지 않는 문자가 있습니다.")
    private String detailAddress;

    @NotBlank(message = "물건 유형은 필수값 입니다.")
    private String buildingType;

    private double supplyArea;

    private double exclusiveArea;

    @NotBlank(message = "매수일 필수값 입니다.")
    @Pattern(regexp = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$", message = "yyyy-MM-dd 형식이어야 합니다.")
    private String purchaseDate;

    private long purchasePrice;

    private long kbMarketPrice;

    private long techMarketPrice;

    private long publicMarketPrice;

    private boolean isHousingRentalBusiness;

    private String housingRentalType;

    @Pattern(regexp = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$", message = "yyyy-MM-dd 형식이어야 합니다.")
    private String housingRentalStartDt;

    @Pattern(regexp = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$", message = "yyyy-MM-dd 형식이어야 합니다.")
    private String housingRentalDutyEndDt;

}
