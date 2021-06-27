package com.rktirthoh.onestore.entity.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCombination {
    private long id;
    private String combinationString;
    private String sku;
    private double price;
    private long uniqueStringId;
    private long productId;
    private int availableStock;
}
