package com.pjsconsulting.masterpiece.mapstruct;

import com.pjsconsulting.masterpiece.persistence.domain.RealEstateDomain;
import com.pjsconsulting.masterpiece.presentation.vo.request.RealEstateCreateRequest;
import com.pjsconsulting.masterpiece.service.dto.RealEstateCreateDTO;
import com.pjsconsulting.masterpiece.service.dto.request.RealEstateCreateReqDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RealEstateMapStructMapper {

    RealEstateCreateReqDTO createRequestToCreateReqDTO(RealEstateCreateRequest realEstateCreateRequest);

    RealEstateCreateDTO createReqDTOToCreateDTO(RealEstateCreateReqDTO realEstateCreateReqDTO);

    RealEstateDomain createDTOToDomain(RealEstateCreateDTO realEstateCreateDTO);
}
