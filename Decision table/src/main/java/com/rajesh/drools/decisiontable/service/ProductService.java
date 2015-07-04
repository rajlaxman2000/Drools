package com.rajesh.drools.decisiontable.service;

import com.rajesh.drools.decisiontable.model.User;
import com.rajesh.drools.decisiontable.model.Product;


/**
 * @author T9739
 *
 */
public interface ProductService {
    void runProductLogic(User user, Product product);
}
