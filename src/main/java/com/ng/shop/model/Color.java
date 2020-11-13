package com.ng.shop.model;

import com.ng.shop.model.entity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Color extends AbstractEntity {
    private String name;
    private String hex;
}
