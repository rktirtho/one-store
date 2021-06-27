package com.rktirthoh.onestore.entity.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductStock {
    private long id;
    private int totalStock;
    private double unitPrice;
    private double totalPrice;
    private double productCombinationId;
}
