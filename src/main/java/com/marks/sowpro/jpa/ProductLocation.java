package com.marks.sowpro.jpa;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_LOCATION")
public class ProductLocation {

    @Id
    @Column(name = "PRODUCT_LOCATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "UPC",columnDefinition = "VARCHAR(20) NOT NULL")
    private String upc;
    
    @Column(name = "STORE_NUMBER",columnDefinition = "INT(10) NOT NULL")
    private Integer storeNo;
    
    @Column(name = "CURRENT_LOCATION_ID",columnDefinition="INT(10) NOT NULL")
    private Integer locationId;
    
    @Column(name = "LOCATION_PATH",columnDefinition="BIGINT NOT NULL")
    private Integer locationPath;
    
    @Column(name = "LAST_MOVED_ON",columnDefinition="DATETIME NOT NULL")
    private Timestamp lastMovedOn;
    
    @Column(name = "LAST_MOVED_BY",columnDefinition="VARCHAR(20) NOT NULL")
    private String lastMovedBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public Integer getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(Integer storeNo) {
        this.storeNo = storeNo;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getLocationPath() {
        return locationPath;
    }

    public void setLocationPath(Integer locationPath) {
        this.locationPath = locationPath;
    }

    public Timestamp getLastMovedOn() {
        return lastMovedOn;
    }

    public void setLastMovedOn(Timestamp lastMovedOn) {
        this.lastMovedOn = lastMovedOn;
    }

    public String getLastMovedBy() {
        return lastMovedBy;
    }

    public void setLastMovedBy(String lastMovedBy) {
        this.lastMovedBy = lastMovedBy;
    }
    
    
}
