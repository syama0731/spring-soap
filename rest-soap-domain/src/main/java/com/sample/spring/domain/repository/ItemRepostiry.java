package com.sample.spring.domain.repository;

import com.sample.spring.domain.model.GetItemResponse;

public interface ItemRepostiry {

    GetItemResponse getItem(int id);
}
