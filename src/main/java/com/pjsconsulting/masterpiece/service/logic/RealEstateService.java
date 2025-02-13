package com.pjsconsulting.masterpiece.service.logic;

import com.pjsconsulting.masterpiece.presentation.vo.response.PageResponse;
import com.pjsconsulting.masterpiece.service.dto.condition.RealEstateSearchDTO;
import com.pjsconsulting.masterpiece.service.dto.request.RealEstateCreateReqDTO;
import com.pjsconsulting.masterpiece.service.dto.response.RealEstateResDTO;

import java.util.List;

public interface RealEstateService {

    String createRealEstate(RealEstateCreateReqDTO realEstateCreateReqDTO);

    List<RealEstateResDTO> listRealEstate(RealEstateSearchDTO realEstateSearchDTO);

    int listRealEstateCount(RealEstateSearchDTO realEstateSearchDTO);

}
