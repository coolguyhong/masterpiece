package com.pjsconsulting.masterpiece.presentation.controller;

import com.pjsconsulting.masterpiece.mapstruct.RealEstateMapStructMapper;
import com.pjsconsulting.masterpiece.presentation.vo.request.RealEstateCreateRequest;
import com.pjsconsulting.masterpiece.presentation.vo.response.CommonResponse;
import com.pjsconsulting.masterpiece.service.dto.request.RealEstateCreateReqDTO;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/real-estates")
public class RealEstateController {

    private final RealEstateMapStructMapper realEstateMapStructMapper;

    public RealEstateController(RealEstateMapStructMapper realEstateMapStructMapper) {
        this.realEstateMapStructMapper = realEstateMapStructMapper;
    }

    public CommonResponse createRealEstate(@Valid @RequestBody RealEstateCreateRequest realEstateCreateRequest) {
        RealEstateCreateReqDTO realEstateCreateReqDTO = realEstateMapStructMapper.createRequestToCreateReqDTO(realEstateCreateRequest);

        return new CommonResponse("OK");
    }
}
