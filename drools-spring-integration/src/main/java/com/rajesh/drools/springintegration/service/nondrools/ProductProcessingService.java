package com.rajesh.drools.springintegration.service.nondrools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.rajesh.drools.springintegration.factory.ProcessingFactory;
import com.rajesh.drools.springintegration.model.Product;
import com.rajesh.drools.springintegration.service.Processor;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: mgrzejszczak
 * Date: 14.01.13
 */
@Component("ProductProcessingService")
public class ProductProcessingService implements Processor<List<Product>> {

    @SuppressWarnings("rawtypes")
	@Autowired
    @Qualifier("NoRulesProcessingFactory")
    private ProcessingFactory<Processor, Product> processingFactory;

    @Override
    @SuppressWarnings("unchecked")
    public void process(List<Product> input) {
        for(Product product : input){            
			Processor<Product> processor = processingFactory.createProcessingObject(product);
            processor.process(product);
        }
    }
}
