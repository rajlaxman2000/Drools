package com.rajesh.drools.decisiontable.service;

import com.rajesh.drools.decisiontable.model.Product;
import com.rajesh.drools.decisiontable.model.User;

/**
 * @author T9739
 *
 */
public interface FinancialService {
    boolean processOrder(User user, Product product);
}
