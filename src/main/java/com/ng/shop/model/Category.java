package com.ng.shop.model;

import com.ng.shop.model.entity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Category extends AbstractEntity {
    private String name;
    private Category parent;
    private List<Category> child;

    public void addChildCategory(Category category) {
        child.add(category);
    }
}
