package com.pjsconsulting.masterpiece.presentation.controller;

import com.pjsconsulting.masterpiece.mapstruct.RealEstateMapStructMapper;
import com.pjsconsulting.masterpiece.presentation.vo.request.RealEstateCreateRequest;
import com.pjsconsulting.masterpiece.presentation.vo.response.CommonResponse;
import com.pjsconsulting.masterpiece.service.dto.request.RealEstateCreateReqDTO;
import com.pjsconsulting.masterpiece.service.logic.RealEstateService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/real-estates")
public class RealEstateController {

    private final RealEstateMapStructMapper realEstateMapStructMapper;

    private final RealEstateService realEstateService;

    public RealEstateController(RealEstateMapStructMapper realEstateMapStructMapper, RealEstateService realEstateService) {
        this.realEstateMapStructMapper = realEstateMapStructMapper;
        this.realEstateService = realEstateService;
    }

    @PostMapping
    public CommonResponse createRealEstate(@Valid @RequestBody RealEstateCreateRequest realEstateCreateRequest) {
        RealEstateCreateReqDTO realEstateCreateReqDTO = realEstateMapStructMapper.createRequestToCreateReqDTO(realEstateCreateRequest);
        final String id = realEstateService.createRealEstate(realEstateCreateReqDTO);
        return new CommonResponse(id);
    }
}
