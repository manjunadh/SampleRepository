package com.marks.sowpro.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SowproController {

    @RequestMapping(value = "/api/v1/inventory-search/byProduct", method = RequestMethod.GET)
    public String getProductDetails(@PathParam(value = "product") String product,
	    @PathParam(value = "store") Integer store) {
	
	return "fetching product details for productid :" + product+"  for store :"+store;
    }
}
