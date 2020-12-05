package com.springcloudbase.eurekapetclient.controller;

import com.springcloudbase.eurekapetclient.entity.Dog;
import com.springcloudbase.eurekapetclient.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    @Autowired
    private DogService dogService;

    /**
     * 若遵循RestFul风格，查询应该用Get请求才对，但是Feign不支持Get请求传递POJO对象，
     * 所以此处我采用了Post的请求方式
     * @param dog
     * @return
     */
    @PostMapping("queryDogs")
    public List<Dog> queryDogs(Dog dog){
       return dogService.queryDogs();
    }
}
