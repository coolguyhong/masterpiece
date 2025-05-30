package com.pjsconsulting.masterpiece.service.logic.impl;

import com.pjsconsulting.masterpiece.mapstruct.RealEstateMapStructMapper;
import com.pjsconsulting.masterpiece.persistence.dto.RealEstateDTO;
import com.pjsconsulting.masterpiece.persistence.repository.RealEstateRepository;
import com.pjsconsulting.masterpiece.service.dto.RealEstateCreateDTO;
import com.pjsconsulting.masterpiece.service.dto.condition.RealEstateSearchDTO;
import com.pjsconsulting.masterpiece.service.dto.request.RealEstateCreateReqDTO;
import com.pjsconsulting.masterpiece.service.dto.response.RealEstateResDTO;
import com.pjsconsulting.masterpiece.service.logic.RealEstateService;
import com.pjsconsulting.masterpiece.util.UuidUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealEstateServiceImpl implements RealEstateService {

    private final RealEstateRepository realEstateRepository;

    private final RealEstateMapStructMapper realEstateMapStructMapper;

    public RealEstateServiceImpl(RealEstateRepository realEstateRepository, RealEstateMapStructMapper realEstateMapStructMapper) {
        this.realEstateRepository = realEstateRepository;
        this.realEstateMapStructMapper = realEstateMapStructMapper;
    }

    @Override
    public String createRealEstate(RealEstateCreateReqDTO realEstateCreateReqDTO) {
        RealEstateCreateDTO realEstateCreateDTO = realEstateMapStructMapper.createReqDTOToCreateDTO(realEstateCreateReqDTO);
        final String id = UuidUtil.generateId("REAL-ESTATE");
        realEstateCreateDTO.setId(id);

        if (!realEstateCreateReqDTO.isHousingRentalBusiness()) {
            realEstateCreateDTO.setHousingRentalStartDate(null);
            realEstateCreateDTO.setHousingRentalDutyEndDate(null);
        }

        realEstateRepository.insertRealEstate(realEstateCreateDTO);

        return id;
    }

    @Override
    public List<RealEstateResDTO> listRealEstate(RealEstateSearchDTO realEstateSearchDTO) {
        List<RealEstateDTO> realEstateDTOList = realEstateRepository.selectRealEstateList(realEstateSearchDTO);
        return realEstateMapStructMapper.dtoListToResDTOList(realEstateDTOList);
    }

    @Override
    public int listRealEstateCount(RealEstateSearchDTO realEstateSearchDTO) {
        return realEstateRepository.selectRealEstateListCount(realEstateSearchDTO);
    }

}
