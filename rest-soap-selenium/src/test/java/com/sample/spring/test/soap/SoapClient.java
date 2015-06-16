package com.sample.spring.test.soap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.sample.spring.domain.model.GetItemRequest;
import com.sample.spring.domain.model.GetItemResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/rest-soap-test.xml")
public class SoapClient {
    
    @Autowired
    private WebServiceTemplate webServiceTemplate;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        GetItemRequest request = new GetItemRequest();
        request.setId(0);
        
        GetItemResponse response = (GetItemResponse) webServiceTemplate.marshalSendAndReceive(request);
        
        assertTrue(response.getPrice() == 100);
        
    }

}
