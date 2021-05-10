package com.shop.studysystem.controller;

import com.shop.studysystem.entity.Goods;
import com.shop.studysystem.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zrfan
 * @Date: 2021/4/18 07:59
 * @Description: TODO
 */

@RestController
public class GoodsController {

    private static final Logger log = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/goods")
    public Goods getGoods() {
        return goodsService.queryGoods();
    }
}
