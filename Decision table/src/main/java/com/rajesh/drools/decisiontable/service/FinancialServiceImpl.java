package com.rajesh.drools.decisiontable.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.rajesh.drools.decisiontable.model.Product;
import com.rajesh.drools.decisiontable.model.User;

import static com.rajesh.drools.decisiontable.model.DecisionType.ACCEPTED;

/**
 * @author T9739
 *
 */
@Component("financialServiceImpl")
public class FinancialServiceImpl implements FinancialService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FinancialServiceImpl.class);

    @Override
    public boolean processOrder(User user, Product product) {
       
    	if(ACCEPTED.equals(user.getDecision())){
            LOGGER.debug("User has been approved - processing the order...");
            return true;
        }

        LOGGER.debug("Sorry, user has been rejected...");
        return false;
    }
}
