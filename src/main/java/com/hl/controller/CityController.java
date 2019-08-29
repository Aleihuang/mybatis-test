package com.hl.controller;


import com.hl.entity.City;
import com.hl.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/add")
    public City add(@RequestParam int id,@RequestParam String name){
        City city = new City();
        city.setId(id);
        city.setName(name);
        return cityService.insertCity(city);
    }

    @RequestMapping("/query/{id}")
    public City query(@PathVariable int id){
        City city = cityService.query(id);
        System.out.println("size is: "+city.getCountryList().size());
        return city;
    }
}
