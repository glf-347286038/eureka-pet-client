package com.springcloudbase.eurekapetclient.service;

import com.springcloudbase.eurekapetclient.entity.Dog;

import java.util.List;

/**
 * @author gaolingfeng
 */
public interface DogService {

    /**
     * 查询所有狗的信息
     * @return
     */
    List<Dog> queryDogs();
}
