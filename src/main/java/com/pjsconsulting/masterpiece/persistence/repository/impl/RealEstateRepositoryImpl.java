package com.pjsconsulting.masterpiece.persistence.repository.impl;

import com.pjsconsulting.masterpiece.mapstruct.RealEstateMapStructMapper;
import com.pjsconsulting.masterpiece.persistence.domain.RealEstateDomain;
import com.pjsconsulting.masterpiece.persistence.mapper.RealEstateMapper;
import com.pjsconsulting.masterpiece.persistence.repository.RealEstateRepository;
import com.pjsconsulting.masterpiece.service.dto.RealEstateCreateDTO;
import org.springframework.stereotype.Repository;

@Repository
public class RealEstateRepositoryImpl implements RealEstateRepository {

    private final RealEstateMapper realEstateMapper;

    private final RealEstateMapStructMapper realEstateMapStructMapper;

    public RealEstateRepositoryImpl(RealEstateMapper realEstateMapper, RealEstateMapStructMapper realEstateMapStructMapper) {
        this.realEstateMapper = realEstateMapper;
        this.realEstateMapStructMapper = realEstateMapStructMapper;
    }

    @Override
    public void insertRealEstate(RealEstateCreateDTO realEstateCreateDTO) {
        RealEstateDomain realEstateDomain = realEstateMapStructMapper.createDTOToDomain(realEstateCreateDTO);
        realEstateMapper.insertRealEstate(realEstateDomain);
    }
}
