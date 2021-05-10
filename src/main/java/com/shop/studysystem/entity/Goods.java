package com.shop.studysystem.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.math.BigDecimal;

/**
 * @Author: zrfan
 * @Date: 2021/4/18 08:55
 * @Description: TODO
 */
public class Goods {
    private Long id;
    @TableField("code")
    private String code;
    @TableField("`name`")
    private String name;
    @TableField("`desc`")
    private String desc;
    @TableField("price")
    private BigDecimal price;
    @TableField("stocks")
    private int stocks;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Goods{");
        sb.append("id=").append(id);
        sb.append(", code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", desc='").append(desc).append('\'');
        sb.append(", price=").append(price);
        sb.append(", stocks=").append(stocks);
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }
}
