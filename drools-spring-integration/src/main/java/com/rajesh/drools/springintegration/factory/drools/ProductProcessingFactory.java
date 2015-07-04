package com.rajesh.drools.springintegration.factory.drools;

import org.drools.runtime.StatelessKnowledgeSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import com.rajesh.drools.springintegration.factory.ProcessingFactory;
import com.rajesh.drools.springintegration.model.Product;


/**
 * Created with IntelliJ IDEA.
 * User: mgrzejszczak
 * Date: 14.01.13
 */
@Component("ProductProcessingFactory")
public class ProductProcessingFactory implements ProcessingFactory<StatelessKnowledgeSession, Product> {

    @Autowired
    private ApplicationContext applicationContext;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductProcessingFactory.class);

    @Override
    public StatelessKnowledgeSession createProcessingObject(Product inputObject) {
    	LOGGER.info("Creating processing object for Product ::"+inputObject.getProductName());
        return (StatelessKnowledgeSession)applicationContext.getBean(inputObject.getTypeEnum().getType() + "KSession");
    }
}
