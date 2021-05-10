package com.shop.studysystem.service;

import com.shop.studysystem.entity.Goods;
import com.shop.studysystem.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zrfan
 * @Date: 2021/4/18 08:58
 * @Description: TODO
 */
@Service
public class GoodsService {


    @Autowired
    private GoodsMapper goodsMapper;

    public Goods queryGoods() {
        return goodsMapper.selectById(1);
    }

}
