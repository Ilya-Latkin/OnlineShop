package com.ng.shop.model;

import com.ng.shop.model.entity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Setter
@Getter
public class ProductVariant extends AbstractEntity {
    private Color color;
    private List<Image> images;
    private Integer price;
}

