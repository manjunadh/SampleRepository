package com.marks.sowpro.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marks.sowpro.jpa.ProductLocation;
import com.marks.sowpro.respository.ProductLocationRepositoey;

@RestController
public class SowproController {

    @Autowired
    ProductLocationRepositoey productLocationRepository;

    @RequestMapping(value = "/api/v1/inventory-search/byProduct", method = RequestMethod.GET)
    public String getProductDetails(@PathParam(value = "product") String product,
	    @PathParam(value = "store") Integer store) {
	return "fetching product details for productid :" + product + "  for store :" + store;
    }

    //select * from product_location where product_location_id=?
    @RequestMapping(value = "/productLocation", method = RequestMethod.GET)
    public ProductLocation getProductLocationBYid(@PathParam(value = "id") Integer id) {
	Optional<ProductLocation> optionalProductLocation = productLocationRepository.findById(id);
	if (optionalProductLocation.isPresent()) {
	    return optionalProductLocation.get();
	}
	return null;
    }
    
    
    //"select * from product_location where store_number=155"
    @RequestMapping(value="/storeNo",method=RequestMethod.GET)
    public List<ProductLocation> getProductLocationsByLocationPath(@PathParam(value="storeNo") Integer storeNo){
	
	return productLocationRepository.findByStoreNo(storeNo);
    }
}
