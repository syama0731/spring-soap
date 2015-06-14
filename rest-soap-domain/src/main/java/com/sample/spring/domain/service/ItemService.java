package com.sample.spring.domain.service;

import com.sample.spring.domain.model.GetItemResponse;

public interface ItemService {

    GetItemResponse getItem(int id);
}
