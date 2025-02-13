package com.pjsconsulting.masterpiece.persistence.repository;

import com.pjsconsulting.masterpiece.persistence.dto.RealEstateDTO;
import com.pjsconsulting.masterpiece.service.dto.RealEstateCreateDTO;
import com.pjsconsulting.masterpiece.service.dto.condition.RealEstateSearchDTO;

import java.util.List;

public interface RealEstateRepository {

    void insertRealEstate(RealEstateCreateDTO realEstateCreateDTO);

    List<RealEstateDTO> selectRealEstateList(RealEstateSearchDTO realEstateSearchDTO);

    int selectRealEstateListCount(RealEstateSearchDTO realEstateSearchDTO);
    
}
