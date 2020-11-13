package com.ng.shop.controller;

import com.ng.shop.model.Category;
import com.ng.shop.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class HomeController {
    @RequestMapping(path = "/product/1", method = RequestMethod.GET)
    @ResponseBody
    Product getProduct() {
        System.out.println("Hello Otec");
        Category category = new Category();
        category.setName("One");

        Category child = new Category();
        child.setName("Two");

        category.setChild(new ArrayList<>());
        category.addChildCategory(child);

        Product product = new Product();
        product.setDescription("FFAAFF");
        product.setCategory(category);
        product.setName("???");
        product.setVariants(new ArrayList<>());
        return product;
    }
}
