package com.marks.sowpro.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.marks.sowpro.jpa.ProductLocation;

public interface ProductLocationRepositoey extends CrudRepository<ProductLocation, Integer>{

    
    List<ProductLocation> findByLocationPath(String locationPath);
    
    List<ProductLocation> findByStoreNo(Integer locationPath);
    
    List<ProductLocation> findByStoreNoAndUpc(Integer storeNo,Integer upc);
}
