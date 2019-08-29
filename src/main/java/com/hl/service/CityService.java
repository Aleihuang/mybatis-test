package com.hl.service;

import com.hl.dao.CityDao;
import com.hl.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityDao cityDao;

    public City insertCity(City city){
        cityDao.insertCity(city);
        return city;
    }

    public City query(int id){
        return cityDao.query(id);
    }
}
