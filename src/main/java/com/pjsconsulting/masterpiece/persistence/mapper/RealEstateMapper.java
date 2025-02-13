package com.pjsconsulting.masterpiece.persistence.mapper;

import com.pjsconsulting.masterpiece.persistence.domain.RealEstateDomain;
import com.pjsconsulting.masterpiece.service.dto.condition.RealEstateSearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RealEstateMapper {

    void insertRealEstate(RealEstateDomain realEstateDomain);

    List<RealEstateDomain> selectRealEstateList(RealEstateSearchDTO realEstateSearchDTO);

    int selectRealEstateListCount(RealEstateSearchDTO realEstateSearchDTO);

}
