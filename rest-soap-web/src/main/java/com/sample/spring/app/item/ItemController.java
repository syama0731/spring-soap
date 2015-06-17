package com.sample.spring.app.item;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.sample.spring.domain.model.GetItemRequest;
import com.sample.spring.domain.model.GetItemResponse;
import com.sample.spring.domain.service.ItemService;
import com.sample.spring.domain.service.ItemServiceImpl;

@Endpoint
public class ItemController {

    Logger logger = LoggerFactory.getLogger(ItemController.class);
    
    private ItemService itemService = new ItemServiceImpl();
    
    @PayloadRoot(localPart="GetItemRequest", namespace="http://localhost:8080/rest-soap-web/soap")
    @ResponsePayload
    public GetItemResponse getItem(@RequestPayload GetItemRequest id) {
        return itemService.getItem(id.getId());
    }
}
