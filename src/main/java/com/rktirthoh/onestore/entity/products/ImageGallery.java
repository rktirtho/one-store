package com.rktirthoh.onestore.entity.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageGallery {
    private long id;
    private String small;
    private String medium;
    private String large;
}
