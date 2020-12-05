package com.springcloudbase.eurekapetclient.service.impl;

import com.springcloudbase.eurekapetclient.entity.Dog;
import com.springcloudbase.eurekapetclient.service.DogService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DogServiceImpl implements DogService {
    @Override
    public List<Dog> queryDogs() {
        //模拟数据库中的数据
        Dog dog01 = new Dog();
        dog01.setName("小黑");
        dog01.setAge(1);
        dog01.setType("中华田园犬");
        Dog dog02 = new Dog();
        dog02.setName("小白");
        dog02.setAge(2);
        dog02.setType("哈士奇");
        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog01);
        dogList.add(dog02);
        return dogList;
    }
}
