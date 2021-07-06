package com.rktirthoh.onestore.entity.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String productName;
    private String productSlug;
    private long subCategoryId;
    private String categoryName;
    private String subcategoryName;
    private long manufacturerId;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable=false)
    private Category category;
}
