package com.sample.spring.domain.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GetItemResponse {

    private int id;
    
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
