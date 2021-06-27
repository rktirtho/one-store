package com.rktirthoh.onestore.entity.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductVariationOption {
    private long id;
    private long productVariationId;
    private String variationName;
    private String variationImg;
    private String sku;
    private double price;
    private long productStockId;
}
