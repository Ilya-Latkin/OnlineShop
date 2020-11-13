package com.ng.shop.model;

import com.ng.shop.model.entity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Product extends AbstractEntity {
    private String name;
    private Category category;
    private List<ProductVariant> variants;
    private String description;
}
