package com.pjsconsulting.masterpiece.mapstruct;

import com.pjsconsulting.masterpiece.persistence.domain.RealEstateDomain;
import com.pjsconsulting.masterpiece.persistence.dto.RealEstateDTO;
import com.pjsconsulting.masterpiece.presentation.vo.condition.RealEstateSearchCondition;
import com.pjsconsulting.masterpiece.presentation.vo.request.RealEstateCreateRequest;
import com.pjsconsulting.masterpiece.presentation.vo.response.RealEstatesResponse;
import com.pjsconsulting.masterpiece.service.dto.RealEstateCreateDTO;
import com.pjsconsulting.masterpiece.service.dto.condition.RealEstateSearchDTO;
import com.pjsconsulting.masterpiece.service.dto.request.RealEstateCreateReqDTO;
import com.pjsconsulting.masterpiece.service.dto.response.RealEstateResDTO;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RealEstateMapStructMapper {

    RealEstateCreateReqDTO createRequestToCreateReqDTO(RealEstateCreateRequest realEstateCreateRequest);

    RealEstateCreateDTO createReqDTOToCreateDTO(RealEstateCreateReqDTO realEstateCreateReqDTO);

    RealEstateDomain createDTOToDomain(RealEstateCreateDTO realEstateCreateDTO);

    @AfterMapping
    default void createDTOToDomain(RealEstateCreateDTO realEstateCreateDTO, @MappingTarget RealEstateDomain realEstateDomain) {
        realEstateDomain.setHousingRentalBusinessYn(realEstateCreateDTO.isHousingRentalBusiness() ? "Y" : "N");
    }

    RealEstateSearchDTO searchConditionToSearchDTO(RealEstateSearchCondition realEstateSearchCondition);

    List<RealEstateDTO> domainListToDTOList(List<RealEstateDomain> realEstateDomainList);

    List<RealEstateResDTO> dtoListToResDTOList(List<RealEstateDTO> realEstateDTOList);

    List<RealEstatesResponse> resDTOListToResponseList(List<RealEstateResDTO> realEstateResDTOList);

}
