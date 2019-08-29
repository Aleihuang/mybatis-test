package com.hl.controller;

import com.hl.entity.Country;
import com.hl.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping("/add")
    public Country insertCountry(@RequestParam int id,@RequestParam String name,@RequestParam int cityId){
        Country country = new Country();
        country.setId(id);
        country.setName(name);
        country.setCityId(cityId);
        countryService.insertCountry(country);
        return country;
    }
}
