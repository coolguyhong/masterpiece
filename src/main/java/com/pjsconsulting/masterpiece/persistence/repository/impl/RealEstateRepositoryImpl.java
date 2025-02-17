package com.pjsconsulting.masterpiece.persistence.repository.impl;

import com.pjsconsulting.masterpiece.mapstruct.RealEstateMapStructMapper;
import com.pjsconsulting.masterpiece.persistence.domain.RealEstateDomain;
import com.pjsconsulting.masterpiece.persistence.dto.RealEstateDTO;
import com.pjsconsulting.masterpiece.persistence.mapper.RealEstateMapper;
import com.pjsconsulting.masterpiece.persistence.repository.RealEstateRepository;
import com.pjsconsulting.masterpiece.service.dto.RealEstateCreateDTO;
import com.pjsconsulting.masterpiece.service.dto.condition.RealEstateSearchDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public List<RealEstateDTO> selectRealEstateList(RealEstateSearchDTO realEstateSearchDTO) {
        List<RealEstateDomain> realEstateDomainList = realEstateMapper.selectRealEstateList(realEstateSearchDTO);

        return realEstateMapStructMapper.domainListToDTOList(realEstateDomainList);
    }

    @Override
    public int selectRealEstateListCount(RealEstateSearchDTO realEstateSearchDTO) {
        return realEstateMapper.selectRealEstateListCount(realEstateSearchDTO);
    }
}
