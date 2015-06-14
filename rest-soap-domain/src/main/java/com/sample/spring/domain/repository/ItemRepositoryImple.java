package com.sample.spring.domain.repository;

import java.util.HashMap;

import com.sample.spring.domain.model.GetItemResponse;

public class ItemRepositoryImple implements ItemRepostiry {

    private static HashMap<Integer, GetItemResponse> items;
    
    static {
        items = new HashMap<Integer, GetItemResponse>();
        
        GetItemResponse item0 = new GetItemResponse();
        item0.setId(0);
        item0.setPrice(100);
        items.put(0, item0);
        
        GetItemResponse item1 = new GetItemResponse();
        item1.setId(1);
        item1.setPrice(100);
        items.put(1, item1);
        
        GetItemResponse item2 = new GetItemResponse();
        item2.setId(2);
        item2.setPrice(200);
        items.put(2, item2);
    }
    
    @Override
    public GetItemResponse getItem(int id) {
        
        return items.get(id);
    }

}
