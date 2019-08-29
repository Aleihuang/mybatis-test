package com.hl.service;

import com.hl.dao.CountryDao;
import com.hl.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryDao countryDao;

    public Country insertCountry(Country country){
        countryDao.insertCountry(country);
        return country;
    }
}
