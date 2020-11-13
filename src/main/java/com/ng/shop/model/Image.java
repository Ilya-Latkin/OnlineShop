package com.ng.shop.model;

import com.ng.shop.model.entity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "images")
public class Image extends AbstractEntity {
    @Column
    private String name;
}
