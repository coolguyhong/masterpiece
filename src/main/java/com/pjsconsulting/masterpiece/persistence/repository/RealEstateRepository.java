package com.pjsconsulting.masterpiece.persistence.repository;

import com.pjsconsulting.masterpiece.service.dto.RealEstateCreateDTO;

public interface RealEstateRepository {

    void insertRealEstate(RealEstateCreateDTO realEstateCreateDTO);
}
