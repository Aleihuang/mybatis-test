package com.hl.dao;

import com.hl.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


public interface CityDao {

    int insertCity(City city);

    City query(int id);
}
