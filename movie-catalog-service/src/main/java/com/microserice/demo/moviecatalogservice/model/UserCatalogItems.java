package com.microserice.demo.moviecatalogservice.model;

import java.util.List;

public class UserCatalogItems {
    public List<CatalogItems> getCatalogItems() {
        return catalogItems;
    }

    public UserCatalogItems() {
    }

    public UserCatalogItems(List<CatalogItems> catalogItems) {
        this.catalogItems = catalogItems;
    }

    public void setCatalogItems(List<CatalogItems> catalogItems) {
        this.catalogItems = catalogItems;
    }

    private List<CatalogItems> catalogItems;

}
