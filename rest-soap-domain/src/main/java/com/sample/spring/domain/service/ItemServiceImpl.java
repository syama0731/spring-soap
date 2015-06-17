package com.sample.spring.domain.service;

import com.sample.spring.domain.model.GetItemResponse;
import com.sample.spring.domain.repository.ItemRepositoryImpl;
import com.sample.spring.domain.repository.ItemRepostiry;

public class ItemServiceImpl implements ItemService {

    ItemRepostiry itemRepository = new ItemRepositoryImpl();
    
    @Override
    public GetItemResponse getItem(int id) {
        return itemRepository.getItem(id);
    }

}
