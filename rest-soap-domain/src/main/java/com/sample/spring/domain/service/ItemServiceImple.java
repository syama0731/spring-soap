package com.sample.spring.domain.service;

import com.sample.spring.domain.model.GetItemResponse;
import com.sample.spring.domain.repository.ItemRepositoryImple;
import com.sample.spring.domain.repository.ItemRepostiry;

public class ItemServiceImple implements ItemService {

    ItemRepostiry itemRepository = new ItemRepositoryImple();
    
    @Override
    public GetItemResponse getItem(int id) {
        return itemRepository.getItem(id);
    }

}
