package com.pjsconsulting.masterpiece.persistence.mapper;

import com.pjsconsulting.masterpiece.persistence.domain.RealEstateDomain;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RealEstateMapper {

    void insertRealEstate(RealEstateDomain realEstateDomain);
}
