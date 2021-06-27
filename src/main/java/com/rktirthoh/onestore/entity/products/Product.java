package com.rktirthoh.onestore.entity.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private long id;
    private String productName;
    private String productSlug;
    private long categoryId;
    private long subCategoryId;
    private String categoryName;
    private String subcategoryName;
    private long manufacturerId;
}
